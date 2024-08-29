package org.example.taskservice.service;


import org.example.taskservice.feign.ProjectClient;
import org.example.taskservice.model.Task;
import org.example.taskservice.repo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private ProjectClient projectClient;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow();
    }


    public Task createTask(Task task) {
        if (projectClient.getProjectById(task.getProjectId()) != null) {
            return taskRepository.save(task);
        }
        throw new RuntimeException("Project not found");
    }

    public Task updateTask(Long id, Task task) {
        Task taskToUpdate = taskRepository.findById(id).orElseThrow();
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setStartDate(task.getStartDate());
        taskToUpdate.setEndDate(task.getEndDate());
        taskToUpdate.setStatus(task.getStatus());
        return taskRepository.save(taskToUpdate);
    }


    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}