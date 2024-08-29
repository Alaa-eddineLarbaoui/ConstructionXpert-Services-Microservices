package org.example.projectservice.repository;

import org.example.projectservice.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project , Integer> {

}
