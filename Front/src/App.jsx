import React, { useState, useEffect } from 'react';
import TaskTable from './components/TaskTable';
import { Container } from 'react-bootstrap';  // Importa el Container de Bootstrap

function App() {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    // Llama a tu API para obtener las tareas (ajusta la URL según tu backend)
    fetch('http://localhost:8080/api/tasks')
      .then((response) => response.json())
      .then((data) => setTasks(data))
      .catch((error) => console.error('Error fetching tasks:', error));
  }, []);

  return (
    <Container className="mt-5">
      <h1 className="text-center">Administrador de Tareas</h1>
      <TaskTable tasks={tasks} />  {/* Pasamos las tareas como props */}
    </Container>
  );
}

export default App;
