package Issue_2.examples;

public class ProductoServicioExample {
    public class EjemploProductoServicio {
    public static void main(String[] args) {
        // Crear instancia del servicio
        ProductoServicio servicio = new ProductoServicio();

        // Ejemplo 1: Crear producto válido
        if (servicio.crearProducto("Laptop", 1200.0)) {
            System.out.println("Producto creado correctamente");
        } else {
            System.out.println("Error al crear producto");
        }

        // Ejemplo 2: Crear producto con nombre vacío
        if (!servicio.crearProducto("", 500.0)) {
            System.out.println("Validación correcta: nombre inválido");
        }

        // Ejemplo 3: Crear producto con precio inválido
        if (!servicio.crearProducto("Celular", -100.0)) {
            System.out.println("Validación correcta: precio inválido");
        }

        // Ejemplo 4: Actualizar producto válido
        if (servicio.actualizarProducto("Tablet", 300.0)) {
            System.out.println("Producto actualizado correctamente");
        }

        // Ejemplo 5: Actualizar producto con datos inválidos
        if (!servicio.actualizarProducto(null, 200.0)) {
            System.out.println("Validación correcta: nombre nulo");
        }
    }
}

}
