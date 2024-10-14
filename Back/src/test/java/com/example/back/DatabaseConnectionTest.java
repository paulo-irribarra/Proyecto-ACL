package com.example.back;

import com.example.Back.Back.ProyectoBackApplication;
import com.example.Back.Back.Task;
import com.example.Back.Back.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ProyectoBackApplication.class)
@Transactional
@Rollback(value = false)
public class DatabaseConnectionTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    public void testDatabaseConnection() {
        // Crear una nueva tarea
        Task task = new Task();
        task.setDescription("Completar el informe QA");
        task.setCompleted(false);

        // Guardar la tarea en la base de datos
        Task savedTask = taskRepository.save(task);

        // Verificar que la tarea se ha guardado con éxito (el ID debe estar asignado)
        assertThat(savedTask.getId()).isNotNull();

        // Verificar que los valores guardados son correctos
        assertThat(savedTask.getDescription()).isEqualTo("Completar el informe QA");
        assertThat(savedTask.getCompleted()).isEqualTo(false);
    }
}



