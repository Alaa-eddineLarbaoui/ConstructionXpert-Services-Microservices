package org.example.taskservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "project-service")
public interface ProjectClient {
    @GetMapping("/api/project/get/{id}")
    Project getProjectById(@PathVariable Long id);
}

@FeignClient(name = "task-service")
public interface TaskClient {

    @DeleteMapping("/api/tasks/{id}")
    void deleteTask(@PathVariable("id") Long id) ;



    public void deleteProject(Long id) {
        taskClient.deleteTask(id);
        projectRepository.deleteById(id);
        ResponseEntity.ok().build();
    }


    METHOde sans body public


methode public