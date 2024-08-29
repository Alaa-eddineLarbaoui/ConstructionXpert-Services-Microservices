package org.example.projectservice.controller;

import org.example.projectservice.model.Project;
import org.example.projectservice.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    // Endpoint to get all projects
    @GetMapping("/getAll")
    public List<Project> showAllProjects() {
        return projectService.showProjects();
    }

    // Endpoint to get a project by ID
    @GetMapping("/get/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Integer id) {
        Project project = projectService.findProject(id);
        return ResponseEntity.ok(project);
    }

    // Endpoint to create a new project
    @PostMapping("/create")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project savedProject = projectService.saveProject(project);
        return ResponseEntity.ok(savedProject);
    }

    // Endpoint to update an existing project
    @PutMapping("/update/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable Integer id, @RequestBody Project updatedProject) {
        Project updated = projectService.UpdateProject(updatedProject, id);
        return ResponseEntity.ok(updated);
    }

    // Endpoint to delete a project by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Integer id) {
        projectService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
