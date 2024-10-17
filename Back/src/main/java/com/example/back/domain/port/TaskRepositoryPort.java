package com.example.back.domain.port;

import com.example.back.domain.model.Task;

import java.util.List;

public interface TaskRepositoryPort {

    List<Task>findAll();
}
