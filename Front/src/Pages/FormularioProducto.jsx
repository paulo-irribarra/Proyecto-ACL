import React, { useState } from 'react';
import { Plus } from 'lucide-react';

const FormularioProducto = () => {
  const [nombre, setNombre] = useState('');
  const [marca, setMarca] = useState(''); // Añadido estado para marca
  const [descripcion, setDescripcion] = useState('');  

  const handleSubmit = async (e) => {
    e.preventDefault();

    const productData = {
      nombre: nombre,
      marca: marca,
      descripcion: descripcion
    };

    try {
      const response = await fetch('http://localhost:8080/api/products', { // Asegúrate de reemplazar con tu URL del endpoint
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(productData),
      });

      if (response.ok) {
        alert("Producto agregado con éxito");
        // Puedes limpiar el formulario o actualizar la interfaz según sea necesario
        setNombre('');
        setMarca('');
        setDescripcion('');
      } else {
        alert("Error al agregar el producto");
      }
    } catch (error) {
      console.error("Error en la solicitud:", error);
      alert("Error en la conexión con el servidor");
    }
  };

  return (
    <div className="flex items-center justify-center min-h-screen bg-gray-100">
      <div className="w-full max-w-lg p-6 bg-white rounded-lg shadow-md">
        <h2 className="text-2xl font-bold mb-6 text-center text-gray-800">Agregar Producto</h2>
        <form onSubmit={handleSubmit}>
          <div className="mb-6">
            <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="nombre">
              Nombre del producto
            </label>
            <input
              className="shadow appearance-none border rounded w-full py-3 px-4 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="nombre"
              type="text"
              value={nombre}
              onChange={(e) => setNombre(e.target.value)}
            />
          </div>
          <div className="mb-6">
            <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="marca">
              Marca del producto
            </label>
            <input
              className="shadow appearance-none border rounded w-full py-3 px-4 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="marca"
              type="text"
              value={marca}
              onChange={(e) => setMarca(e.target.value)}
            />
          </div>
          <div className="mb-6">
            <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="descripcion">
              Descripción del producto
            </label>
            <textarea
              className="shadow appearance-none border rounded w-full py-3 px-4 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="descripcion"
              value={descripcion}
              onChange={(e) => setDescripcion(e.target.value)}
            />
          </div>
          <button
            className="w-full bg-blue-500 hover:bg-blue-700 text-white font-bold py-3 rounded focus:outline-none focus:shadow-outline"
            type="submit"
          >
            Agregar Producto
          </button>
        </form>
      </div>
    </div>
  );
};

export default FormularioProducto;
