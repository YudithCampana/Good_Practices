
// Incluye memory para usar punteros inteligentes
#include <memory>
// Incluye iostream para imprimir
#include <iostream>

// Define una estructura simple con un número
struct Nodo {
    // Campo que guarda un valor entero
    int valor;
};

// Función principal
int main() {

    // Crea un Nodo en memoria de forma segura con unique_ptr (se libera automáticamente)
    std::unique_ptr<Nodo> nodo = std::make_unique<Nodo>();

    // Asigna el número 42 al campo valor del nodo
    nodo->valor = 42;

    // Imprime el valor del nodo en la consola
    std::cout << "Valor del nodo: " << nodo->valor << std::endl;

    // Al salir del bloque, unique_ptr libera la memoria automáticamente
    return 0;
}
