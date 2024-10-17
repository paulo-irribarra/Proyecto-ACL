package com.example.back.adpters.inbound;


import com.example.back.application.TaskService;
import com.example.back.domain.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping("/api/tasks")
    public List<Task> getAllTask(){
        // Nos devolvera una lista de tareas desde el servicio o repositorio
        return taskService.getAllTask();
    }
}
