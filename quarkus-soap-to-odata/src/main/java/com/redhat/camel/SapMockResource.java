package com.redhat.camel;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.Logger;

@Path("/sap/mock/odata")
public class SapMockResource {

    private static final Logger LOG = Logger.getLogger(SapMockResource.class);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response receiveData(String data) {
        LOG.info("Mock SAP OData received data: " + data);
        // Simular una respuesta de éxito de SAP
        return Response.ok("{\"status\": \"success\"}").build();
    }
}
