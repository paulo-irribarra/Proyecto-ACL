import React, { useState, useEffect } from 'react';
import TaskTable from './components/TaskTable';
import { Container, Spinner, Alert } from 'react-bootstrap';  // Agrega Spinner y Alert para la UX

function App() {
  const [tasks, setTasks] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch('http://localhost:8080/api/tasks')
      .then((response) => {
        if (!response.ok) {
          throw new Error('Failed to fetch tasks');
        }
        return response.json();
      })
      .then((data) => {
        setTasks(data);
        setLoading(false);
      })
      .catch((error) => {
        console.error('Error fetching tasks:', error);
        setError(error);
        setLoading(false);
      });
  }, []);

  const handleAddTask = () => {
    console.log('Agregar tarea');
    // Aquí iría la lógica para agregar una nueva tarea (ej. un formulario o llamada API)
  };

  return (
    <Container fluid className="d-flex flex-column justify-content-center align-items-center vh-100">
      <h1 className="text-center mb-4">Lista de tareas desde la base de datos</h1>
      {loading && <Spinner animation="border" variant="primary" />}
      {error && <Alert variant="danger">Error fetching tasks: {error.message}</Alert>}
      {!loading && !error && <TaskTable tasks={tasks} />} 
    </Container>



    


    
  );
}

export default App;
