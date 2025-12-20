public class ProductoServicioTest {
    public static void main(String[] args) {
        ProductoServicio s= new ProductoServicio();
        // Prueba 1
        if (s.crearProducto("libro", 500)) {
            System.out.println("OK 1");
        }
        //Prueba 2 
        if(!s.crearProducto("", 100)) {
            System.out.println("OK 2");
        }

    }
}