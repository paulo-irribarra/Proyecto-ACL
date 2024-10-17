package com.example.back;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ProyectoBackApplication.class)
@Transactional
@Rollback(value = false)
public class DatabaseConnectionTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testDatabaseConnection() {
        // Crear una nueva tarea
        String description = "Completar el informe QA";
        boolean completed = false;

        // Guardar la tarea en la base de datos
        String insertQuery = "INSERT INTO tasks (description, completed) VALUES (?, ?)";
        jdbcTemplate.update(insertQuery, description, completed);
    }
}



