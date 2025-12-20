public class ProductoServicio {
    public boolean validarDatos(String nombre, double precio) {
        // Validar datos.
        if (nombre == null || nombre.trim().isEmpty() || precio <= 0) {
            System.out.println("Datos inválidos");
            return false;
        }
            return true;
    }
    // Crear productos.
    public boolean crearProducto(String nombre, double precio) {
        if(!validarDatos(nombre, precio)) {
            return false;
        }
        //Crear producto.
            return true;
     }
    // Actualizar producto.
    public boolean actualizarProducto (String nombre, double precio) {
        if(!validarDatos(nombre, precio)) {
             return false;
    }
    // Actualizar producto.
    return true;
   }
  }


