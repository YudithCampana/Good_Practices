
// Clase que expone datos directamente (mala encapsulación)
class Usuario {

    // Campo público; cualquiera puede cambiarlo sin control (mala práctica)
    public String nombre;
}

// Clase principal con varias malas prácticas
public class EjemploMalo {

    // Método principal
    public static void main(String[] args) {

        // Crea un usuario y le pone un nombre directamente (sin validación)
        Usuario u = new Usuario();
        u.nombre = "Ana";

        // Compara Strings con '==', que compara referencias, no contenido (mala práctica)
        if (u.nombre == "Ana") {
            // Usa System.out.println para "logs" en lugar de una librería de logging
            System.out.println("Coincidencia encontrada"); // poco profesional en apps reales
        }
    }
}
