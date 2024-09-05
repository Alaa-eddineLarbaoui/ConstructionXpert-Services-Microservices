package org.example.resourceservice.feign;

import lombok.Data;
import org.example.resourceservice.enums.Status;

import java.time.LocalDate;

@Data
public class Task {

    private Long id;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status status;
    private Long projectId;
}
