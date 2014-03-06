package com.geowarin.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception) {
        return Response.status(404)
                        .entity(exception.getMessage())
                        .type("text/plain")
                        .build();
    }
}
