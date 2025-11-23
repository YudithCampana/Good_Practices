// usar std::vector, std::string y const.
// Incluye la biblioteca vector para listas dinámicas
#include <vector>
// Incluye la biblioteca string para cadenas de texto seguras
#include <string>
// Incluye la biblioteca iostream para imprimir
#include <iostream>

// Función que calcula el total de precios sin modificar los datos de entrada
double calcular_total(const std::vector<double>& precios) {

    // Inicializa la suma en cero
    double suma = 0.0;

    // Recorre el vector usando un for basado en rango (más claro y seguro)
    for (double p : precios) {
        // Suma cada precio a la variable suma
        suma += p;
    }

    // Devuelve el total calculado
    return suma;
}

// Función principal del programa
int main() {

    // Crea un vector con algunos precios
    std::vector<double> precios = {10.0, 20.0, 5.5};

    // Llama a la función para calcular el total
    double total = calcular_total(precios);

    // Imprime el resultado en la consola
    std::cout << "Total: " << total << std::endl;

    // Devuelve 0 indicando que el programa terminó bien
    return 0;
}
