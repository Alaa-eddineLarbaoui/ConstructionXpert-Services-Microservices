package org.example.resourceservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.resourceservice.enums.Type;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, length = 255)
    private Type type;

    private String provider;

    @Column(name = "task_id" , nullable = false)
    private Long taskId;

}
