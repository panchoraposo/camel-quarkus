package com.redhat.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;

import com.sap.document.sap.rfc.functions.ZRFCZACPMF001Response;

public class SoapToRestRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // Ruta para manejar la solicitud REST y llamar al servicio SOAP
        from("direct:soapService")
            .routeId("soapToRestRoute")
            .setHeader(CxfConstants.OPERATION_NAME, constant("SI_WS_TO_RFC_ZACPMF001_Req")) // Cambia al nombre de la operación SOAP
            .to("cxf://http://localhost:8080/acindar/soapService?serviceClass=app.acindar.consumosma.creaorden.SIWSTORFCZACPMF001Req&wsdlURL=/wsdl/SI_WS_TO_RFC_ZACPMF001_ReqService.wsdl")
            .process(new Processor() {
                public void process(Exchange exchange) throws Exception {
                    // Recupera el objeto de respuesta SOAP y lo transforma a JSON
                    ZRFCZACPMF001Response response = exchange.getMessage().getBody(ZRFCZACPMF001Response.class);
                    exchange.getMessage().setBody(response);
                }
            })
            .marshal().json() // Convierte el objeto de respuesta en JSON
            .log("Returning JSON response: ${body}");
    }
}