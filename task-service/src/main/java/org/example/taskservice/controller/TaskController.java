package org.example.taskservice.controller;

import org.example.taskservice.model.Task;
import org.example.taskservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task/")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("getAll")
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("get/{id}")
    public Task getTask(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("add")
    public Task addTask( @RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("update/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("delete/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}