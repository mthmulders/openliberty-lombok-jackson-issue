package io.github.mthmulders.endpoints;

import io.github.mthmulders.model.DemoEntity;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class DemoEndpoint {
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    public String getCardInfo(final DemoEntity demoEntity) {
        return "Got it!";
    }
}
