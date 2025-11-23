
// Define una función asíncrona para obtener datos desde un servidor
async function cargarUsuarios() {
  // Intenta realizar la solicitud y manejar posibles errores
  try {
    // Hace una petición HTTP usando fetch
    const res = await fetch("https://api.example.com/users");
    // Verifica que la respuesta sea exitosa (código 200–299)
    if (!res.ok) throw new Error("HTTP " + res.status);
    // Convierte la respuesta a JSON
    const data = await res.json();
    // Imprime los datos en la consola
    console.log("Usuarios:", data);
    // Devuelve los datos para que otra función los use
    return data;
  // Captura y muestra cualquier error que haya ocurrido
  } catch (err) {
    // Imprime el error en la consola para depurar
    console.error("Error al cargar usuarios:", err);
    // Re-lanza el error por si quien llama quiere manejarlo
    throw err;
  }
}

// Llama a la función (en un entorno navegador o Node con fetch disponible)
cargarUsuarios();
