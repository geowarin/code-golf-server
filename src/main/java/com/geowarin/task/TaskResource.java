package com.geowarin.task;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/task")
@Component
public class TaskResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list.json")
    public List<Task> listTasks() {
        return Arrays.asList(new Task("geowarin"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/profiles.json")
    public String activeProfiles() {
        return System.getProperty("spring.profiles.active");
    }
}
