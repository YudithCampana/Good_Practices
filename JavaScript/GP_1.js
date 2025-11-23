
// Declara una constante con el impuesto a aplicar (no cambia)
const IMPUESTO = 0.15;

// Define una función pura que calcula total, sin modificar sus entradas
function calcularTotal(precio, cantidad) {
  // Valida que el precio sea positivo; si no, lanza un error
  if (precio <= 0) throw new Error("El precio debe ser positivo");
  // Valida que la cantidad sea al menos 1; si no, lanza un error
  if (cantidad <= 0) throw new Error("La cantidad debe ser positiva");
  // Calcula el subtotal multiplicando precio por cantidad
  const subtotal = precio * cantidad;
  // Calcula el total sumando el impuesto
  const total = subtotal * (1 + IMPUESTO);
  // Devuelve el total calculado
  return total;
}

// Llama a la función con valores de ejemplo y guarda el resultado
let resultado = calcularTotal(100, 2);
// Imprime el resultado en la consola
console.log("Total:", resultado);
