package com.example.back.domain.port;

import com.example.back.domain.Task;

import java.util.List;

public interface TaskRepositoryPort {

    List<Task> findAll();

    List<Task> findAllUsers();
}
