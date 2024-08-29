package org.example.resourceservice.service;

import org.example.resourceservice.feign.TaskClient;
import org.example.resourceservice.model.Resource;
import org.example.resourceservice.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    @Autowired
    private TaskClient taskClient;

    public List<Resource> showResources() {
        return resourceRepository.findAll();
    }

    public Resource createResource(Resource resource) {
        if (taskClient.getTaskById(resource.getTaskId()) != null) {
            return resourceRepository.save(resource);
        }
        throw new RuntimeException("Task not found");
    }

    public Resource findResource(Long id) {
        return resourceRepository.findById(id).orElseThrow(() -> new RuntimeException("Resource not found"));
    }

    public Resource updateResource(Resource updatedResource, Long id) {
        Resource resource = findResource(id);
        resource.setName(updatedResource.getName());
        resource.setQuantity(updatedResource.getQuantity());
        resource.setType(updatedResource.getType());
        resource.setProvider(updatedResource.getProvider());
        resource.setTaskId(updatedResource.getTaskId());
        return resourceRepository.save(resource);
    }

    public void deleteResource(Long id) {
        resourceRepository.deleteById(id);
    }
}
