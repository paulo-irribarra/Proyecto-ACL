package com.example.back.application.port;

import com.example.back.domain.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
}
