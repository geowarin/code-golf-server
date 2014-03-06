package com.geowarin.redirect;

import com.geowarin.task.Task;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

@Component
@Path("/redirect.json")
public class RedirectResource {

    @Context
    UriInfo uriInfo;

    @Inject
    RedirectService redirectService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String listTasks() {
        return redirectService.getRedirectUrl(uriInfo.getBaseUri());
    }



}
