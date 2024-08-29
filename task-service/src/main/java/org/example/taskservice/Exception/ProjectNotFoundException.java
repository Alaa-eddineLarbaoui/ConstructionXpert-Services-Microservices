package org.example.taskservice.Exception;

public class ProjectNotFoundException extends RuntimeException{
    public ProjectNotFoundException(String id){
        super("project with this id not found " + id);
    }
}
