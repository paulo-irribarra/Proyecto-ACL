package com.example.Back.Back;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private boolean completed;

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter para 'description'
    public String getDescription() {
        return description;
    }

    // Setter para 'description'
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter para 'completed'
    public Boolean getCompleted() {
        return completed;
    }

    // Setter para 'completed'
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }



}
