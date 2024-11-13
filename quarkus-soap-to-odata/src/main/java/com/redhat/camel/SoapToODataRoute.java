package com.redhat.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.camel.component.jackson.JacksonDataFormat;
import com.sap.document.sap.rfc.functions.ZRFCZACPMF001Response;

public class SoapToODataRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // Formato JSON para convertir el objeto SOAP a JSON
        JacksonDataFormat jsonFormat = new JacksonDataFormat(ZRFCZACPMF001Response.class);

        // Ruta que obtiene datos del servicio SOAP y los envía al servicio OData de SAP
        from("timer:soapToOData?period=60000") // Ejemplo de cron para ejecutar cada minuto
            .routeId("soapToODataRoute")
            .log("Fetching data from SOAP service")
            .setHeader(CxfConstants.OPERATION_NAME, constant("SI_WS_TO_RFC_ZACPMF001_Req")) // Cambia al nombre de operación correcto
            .to("cxf://http://quarkus-cxf-soap/acindar/soapService?serviceClass=app.acindar.consumosma.creaorden.SIWSTORFCZACPMF001Req&wsdlURL=/wsdl/SI_WS_TO_RFC_ZACPMF001_ReqService.wsdl")
            .log("SOAP response received")
            .marshal(jsonFormat) // Convierte el objeto de respuesta SOAP a JSON
            .log("Sending data to SAP OData mock endpoint")
            .to("http://quarkus-soap-to-odata/sap/mock/odata") // URL del mock OData
            .log("Data sent to SAP OData");
    }
}