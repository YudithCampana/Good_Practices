
// ejercicio5/NombreUtils.java (versión para corregir)
// public class NombreUtils {
// public static String crear(String nombre){
// nombre = nombre.trim().toLowerCase();
// nombre = nombre.replace(" ", " ");
// return nombre;
// }
// public static String actualizar(String nombre){
// nombre = nombre.trim().toLowerCase();
// nombre = nombre.replace(" ", " ");
// return nombre;
// }
// }
// Versión corregida 
public class NombreUtils {

    public static String normalize(String stringToNormalize) {
        return stringToNormalize.trim().toLowerCase().replace(" ", " ");
    }

    public static String crear(String nombre) {
        String nuevoNombre = normalize(nombre);
        return nuevoNombre;
    }

    public static String actualizar(String nombre) {
        String nuevoNombre = normalize(nombre);
        return nuevoNombre;
    }

}
