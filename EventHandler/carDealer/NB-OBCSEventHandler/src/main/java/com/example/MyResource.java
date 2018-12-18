package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/recallEvents")
public class MyResource {

    private static final CopyOnWriteArrayList<RecallEvent> ELIST = new CopyOnWriteArrayList<>();

    /**
     * Method handling HTTP GET requests. The returned object will be sent to
     * the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(RecallEvent event) {
        if(event != null) ELIST.add(event);
        return Response.status(Response.Status.OK).build();
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public RecallEvent[] getAllCustomers() {
        return ELIST.toArray(new RecallEvent[0]);
    }
}
