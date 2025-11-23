
// Imprime la variable antes de declararla; con var aparece como undefined (confuso)
console.log(x); // undefined por hoisting
// Declara la variable con var (evitarlo en código moderno)
var x = 3;
// Compara usando == que hace conversiones peligrosas
if (0 == "") {
  // Esta condición se cumple por coerción, lo cual puede sorprender
  console.log("Comparación laxa verdadera");
}
