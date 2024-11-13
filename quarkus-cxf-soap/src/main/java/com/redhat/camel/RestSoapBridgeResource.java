package com.redhat.camel;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.apache.camel.ProducerTemplate;

@Path("/rest/soap")
public class RestSoapBridgeResource {

    private final ProducerTemplate producerTemplate;

    public RestSoapBridgeResource(ProducerTemplate producerTemplate) {
        this.producerTemplate = producerTemplate;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object getSoapAsJson() {
        // Llama a la ruta Camel que convierte SOAP a JSON
        return producerTemplate.requestBody("direct:soapService", null, Object.class);
    }
    
}
