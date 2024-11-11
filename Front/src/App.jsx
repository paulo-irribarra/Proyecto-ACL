import React from 'react'; 
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import NavigationBar from './components/Navbar';
import Inventory from './pages/Inventory';
import Dashboard from './pages/Dashboard';
import FormularioProducto from './pages/FormularioProducto'; // Importa el componente

function App() {
  return (
    <Router>
      <NavigationBar />
      <div className="container-fluid mt-3 full-screen">
        <Routes>
          <Route path="/dashboard" element={<Dashboard />} />
          <Route path="/inventory" element={<Inventory />} />
          <Route path="/formulario" element={<FormularioProducto />} /> {/* Nueva Ruta */}
        </Routes>
      </div>
    </Router>
  );
}

export default App;
