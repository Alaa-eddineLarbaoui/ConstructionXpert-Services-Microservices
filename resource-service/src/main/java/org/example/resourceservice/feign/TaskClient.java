package org.example.resourceservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "task-service")
public interface TaskClient {
    @GetMapping("/api/task/get/{id}")
    Task getTaskById(@PathVariable Long id);
}