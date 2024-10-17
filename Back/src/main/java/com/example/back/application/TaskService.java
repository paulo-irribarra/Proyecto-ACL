package com.example.back.application;

import com.example.back.domain.port.TaskRepositoryPort;
import com.example.back.domain.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepositoryPort taskRepositoryPort;

    public TaskService(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    public List<Task> getAllTask(){
        return taskRepositoryPort.findAll();
    }
}
