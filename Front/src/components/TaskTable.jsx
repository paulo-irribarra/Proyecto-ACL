import React from 'react';
import { Table } from 'react-bootstrap';  // Importa el componente Table de React-Bootstrap

const TaskTable = ({ tasks }) => {
  return (
    <Table striped bordered hover className="mt-4">
      <thead>
        <tr>
          <th>ID</th>
          <th>Completed</th>
          <th>Description</th>
        </tr>
      </thead>
      <tbody>
        {tasks.map((task) => (
          <tr key={task.id}>
            <td>{task.id}</td>
            <td>{task.completed ? 'Yes' : 'No'}</td>
            <td>{task.description}</td>
          </tr>
        ))}
      </tbody>
    </Table>
  );
};

export default TaskTable;
