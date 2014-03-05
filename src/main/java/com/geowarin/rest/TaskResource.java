package com.geowarin.rest;

import com.geowarin.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/task")
@Component
public class TaskResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "hello";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list.json")
    public List<Task> listTasks() {
        return Arrays.asList(new Task("geowarin"));
    }
}
