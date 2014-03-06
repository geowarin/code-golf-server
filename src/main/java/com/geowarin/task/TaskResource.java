package com.geowarin.task;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/task")
@Component
public class TaskResource {

    @Inject
    private TaskRepository taskRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list.json")
    public List<Task> listTasks() {
        return taskRepository.findAll();
//        return Arrays.asList(new Task("geowarin"));
    }
}
