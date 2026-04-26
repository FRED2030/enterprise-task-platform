package com.enterprise.taskplatform.controller;

import com.enterprise.taskplatform.domain.Task;
import com.enterprise.taskplatform.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/")
public String home() {
    return "Task Platform is running. Visit /api/v1/tasks";
}

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return service.createTask(task);
    }
}
