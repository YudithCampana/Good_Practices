
// Importa clases para trabajar con archivos y rutas
import java.nio.file.Files;
// Importa la clase Path para representar rutas de archivos
import java.nio.file.Path;
// Importa clase IOException que se usa cuando hay problemas de entrada/salida
import java.io.IOException;

// Clase pública para leer un archivo de texto y mostrarlo línea por línea
public class LectorArchivoSeguro {

    // Método principal
    public static void main(String[] args) {

        // Define la ruta del archivo que queremos leer
        Path ruta = Path.of("ejemplo.txt");

        // Usa try-with-resources para abrir y cerrar automáticamente el archivo
        try (var lineas = Files.lines(ruta)) {

            // Recorre cada línea del archivo y la imprime en pantalla
            lineas.forEach(System.out::println);

        // Captura errores de archivo (por ejemplo, archivo no encontrado)
        } catch (IOException e) {

            // Muestra un mensaje con contexto y el error original
            System.err.println("No se pudo leer el archivo: " + e.getMessage());
        }
    }
}
