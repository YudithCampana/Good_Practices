//: nombres claros, validación y responsabilidad única
// Importa la clase Scanner para leer desde la consola
import java.util.Scanner;

// Define una clase pública llamada CalculadoraDescuento
public class CalculadoraDescuento {

    // Método principal que la JVM ejecuta al iniciar el programa
    public static void main(String[] args) {

        // Crea un lector para capturar texto ingresado por el usuario
        Scanner scanner = new Scanner(System.in);

        // Muestra un mensaje explicando qué dato debe ingresar el usuario
        System.out.print("Precio unitario: ");

        // Lee un número decimal del teclado y lo guarda en la variable precio
        double precio = scanner.nextDouble();

        // Pide la cantidad de unidades que el usuario desea
        System.out.print("Cantidad: ");

        // Lee un número entero del teclado y lo guarda en la variable cantidad
        int cantidad = scanner.nextInt();

        // Calcula el total con descuento llamando a una función clara y reutilizable
        double total = calcularTotalConDescuento(precio, cantidad);

        // Muestra el resultado en pantalla con un texto explicativo
        System.out.println("Total a pagar: " + total);

        // Cierra el scanner para liberar el recurso de entrada
        scanner.close();
    }

    // Define una función que calcula el total con descuento aplicando reglas simples
    public static double calcularTotalConDescuento(double precioUnitario, int cantidad) {

        // Valida que el precio sea mayor que cero; si no, lanza una excepción
        if (precioUnitario <= 0) throw new IllegalArgumentException("El precio debe ser positivo");

        // Valida que la cantidad sea al menos 1; si no, lanza una excepción
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser positiva");

        // Calcula el subtotal multiplicando precio por cantidad
        double subtotal = precioUnitario * cantidad;

        // Aplica un 10% de descuento si la cantidad es 10 o más; si no, 0% de descuento
        double descuento = (cantidad >= 10) ? 0.10 : 0.0;

        // Calcula el total restando el porcentaje de descuento al subtotal
        return subtotal * (1 - descuento);
    }
}
