
// Objeto de configuración compartido
const config = { intentos: 3 };

// Función que muta el objeto global (mala práctica)
function aumentarIntentos() {
  // Incrementa el valor, afectando a todo el programa que use config
  config.intentos++; // mutación inesperada
}

// Hace una petición HTTP y no maneja errores con catch
fetch("/api/items").then(res => res.json()); // falta .catch(...)

// Llama a la función que muta el estado global
aumentarIntentos();
