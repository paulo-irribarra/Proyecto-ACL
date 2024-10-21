import React from 'react';
import { Table } from 'react-bootstrap';  // Importa el componente Table de React-Bootstrap

const TaskTable = ({ tasks }) => {
  return (
    <Table striped bordered hover className="mt-4 w-75">
      <caption className="text-center">Lista de tareas actuales</caption>  {/* Título accesible para la tabla */}
      <thead>
        <tr>
          <th>ID</th>
          <th>Completado</th>
          <th>Descripción</th>
        </tr>
      </thead>
      <tbody>
        {tasks.length > 0 ? (
          tasks.map((task) => (
            <tr key={task.id}>
              <td>{task.id}</td>
              <td>{task.completed ? 'Yes' : 'No'}</td>
              <td>{task.description}</td>
            </tr>
          ))
        ) : (
          <tr>
            <td colSpan="3" className="text-center">
              No hay tareas disponibles
            </td>
          </tr>
        )}
      </tbody>
    </Table>
  );
};

export default TaskTable;
