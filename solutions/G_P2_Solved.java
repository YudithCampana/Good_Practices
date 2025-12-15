import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * Clase que demuestra buenas prácticas en la lectura de archivos.
 * Implementa try-with-resources y manejo específico de excepciones.
 */
public class G_P2_Solved {

    public static void main(String[] args) {
        // Definición de la ruta utilizando la clase Path para compatibilidad entre SO
        Path ruta = Path.of("ejemplo.txt");

        /* * APLICACIÓN DE BUENA PRÁCTICA: Try-with-resources.
         * La instancia 'lineas' implementa AutoCloseable, por lo que Java
         * cerrará el flujo automáticamente al terminar el bloque, evitando fugas de memoria.
         */
        try (Stream<String> lineas = Files.lines(ruta)) {

            // Uso de Stream API para mejorar la legibilidad del procesamiento
            lineas.forEach(System.out::println);

        } catch (IOException e) {
            /* * APLICACIÓN DE BUENA PRÁCTICA: Manejo específico de excepciones.
             * Solo capturamos IOException (errores de archivo), no Exception general.
             * Proporcionamos feedback contextual con e.getMessage().
             */
            System.err.println("No se pudo acceder al archivo solicitado: " + e.getMessage());
        }
    }
}