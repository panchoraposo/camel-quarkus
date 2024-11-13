package com.redhat.camel;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;

import com.sap.document.sap.rfc.functions.ZRFCZACPMF001Response;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class SoapMockRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxf:/soapService?serviceClass=app.acindar.consumosma.creaorden.SIWSTORFCZACPMF001Req&wsdlURL=/wsdl/SI_WS_TO_RFC_ZACPMF001_ReqService.wsdl")
            .routeId("mockSoapRoute")
            .process(exchange -> exchange.getMessage().setBody(loadStaticResponse()))
            .log("Returning mapped SOAP response")
            .log("SOAP Response: ${body}");
    }

    private ZRFCZACPMF001Response loadStaticResponse() {
        try {
            // Cargar el archivo XML y deserializar a un objeto de clase ResponseClass
            JAXBContext jaxbContext = JAXBContext.newInstance(ZRFCZACPMF001Response.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            InputStream inputStream = getClass().getResourceAsStream("/response.xml");

            return (ZRFCZACPMF001Response) unmarshaller.unmarshal(inputStream);
        } catch (JAXBException | NullPointerException e) {
            throw new RuntimeException("Failed to load and map static SOAP response", e);
        }
    }
}