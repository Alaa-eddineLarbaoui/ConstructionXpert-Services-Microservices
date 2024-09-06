package org.example.resourceservice.feign;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private Long id;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long projectId;
}
