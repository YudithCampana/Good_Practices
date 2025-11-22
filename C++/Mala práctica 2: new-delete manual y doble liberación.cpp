
// Incluye iostream para imprimir
#include <iostream>

// Función principal
int main() {

    // Reserva memoria manualmente para un entero
    int* p = new int(5);

    // Imprime el valor del entero
    std::cout << *p << std::endl;

    // Libera la memoria
    delete p;

    // Intenta liberar de nuevo la misma memoria (doble delete) → comportamiento indefinido
    delete p; // ERROR: puede crashear

    // Termina el programa
    return 0;
}
