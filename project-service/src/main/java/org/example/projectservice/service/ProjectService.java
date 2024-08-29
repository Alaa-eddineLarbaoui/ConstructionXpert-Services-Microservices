package org.example.projectservice.service;

import org.example.projectservice.model.Project;
import org.example.projectservice.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public List<Project> showProjects() {
        return projectRepository.findAll();
    }


    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }


    public Project findProject(Integer id) {
        return projectRepository.findById(id).orElseThrow();
    }

    public Project UpdateProject(Project updatedProject, Integer id) {
        Project project1 = findProject(id);
        project1.setName(updatedProject.getName());
        project1.setDescription(updatedProject.getDescription());
        project1.setEndDate(updatedProject.getEndDate());
        project1.setBudget(updatedProject.getBudget());
        return projectRepository.save(project1);
    }


    public void delete(Integer id ){
        projectRepository.deleteById(id);
    }

}

