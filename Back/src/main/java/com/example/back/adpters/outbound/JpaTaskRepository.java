package com.example.back.adpters.outbound;

import com.example.back.domain.port.TaskRepositoryPort;
import com.example.back.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaTaskRepository extends JpaRepository<Task, Integer>, TaskRepositoryPort {

    default List<Task> findAllUsers() {
        return findAll();  
    }

}
