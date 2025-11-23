
// Importa clases para leer archivos
import java.io.BufferedReader;
// Importa FileReader para abrir un archivo de texto
import java.io.FileReader;

// Clase con manejo deficiente de recursos y excepciones
public class LectorMalo {

    // Método principal
    public static void main(String[] args) {

        // Declara una variable para el lector de archivos
        BufferedReader br = null;

        try {
            // Abre el archivo sin validar si existe
            br = new BufferedReader(new FileReader("ejemplo.txt"));

            // Lee una línea del archivo
            String linea = br.readLine();

            // Imprime la línea sin verificar si es null
            System.out.println(linea);

        // Captura Exception genérica y no informa adecuadamente el problema
        } catch (Exception e) {
            // Silencia detalles o no agrega contexto (mala práctica)
            System.out.println("Algo falló");
        }

        // Olvida cerrar el BufferedReader si hubo error (puede causar fuga de recursos)
        // Falta br.close(); y un finally o try-with-resources
    }
}
