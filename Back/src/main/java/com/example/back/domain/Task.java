package com.example.back.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Table(name = "tasks")
@ToString @EqualsAndHashCode
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "completed")
    private String completed;

    @Getter @Setter @Column(name = "description")
    private String description;
}
