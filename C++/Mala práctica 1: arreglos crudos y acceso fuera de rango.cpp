
// Incluye iostream para imprimir
#include <iostream>

// Función principal
int main() {

    // Declara un arreglo de 3 enteros inicializado
    int arr[3] = {1, 2, 3};

    // Intenta acceder al índice 5 que no existe (comportamiento indefinido)
    int x = arr[5]; // ERROR: fuera de rango

    // Imprime el valor leído, que será basura o provocará fallo
    std::cout << "Valor incorrecto: " << x << std::endl;

    // Termina el programa
    return 0;
}
