import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ProductoServicio productoServicio;
    private ExportarTxt exportador;

    public Menu() {
        scanner = new Scanner(System.in);
        productoServicio = new ProductoServicio();
        exportador = new ExportarTxt();
    }

    // Método para iniciar el menú
    public void iniciar() {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1 Listar Producto");
            System.out.println("2 Agregar Producto");
            System.out.println("3 Exportar Datos");
            System.out.println("4 Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                productoServicio.listarProductos();
            } else if (opcion == 2) {
                agregarProducto();
            } else if (opcion == 3) {
                exportador.exportar(productoServicio.getListaProductos());
            } else if (opcion == 4) {
                System.out.println("Ha salido del programa");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    // Método auxiliar para agregar productos
    private void agregarProducto() {
        System.out.print("Ingresar nombre artículo: ");
        String articulo = scanner.nextLine();
        System.out.print("Ingresa precio: ");
        String precio = scanner.nextLine();
        System.out.print("Ingresa descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingresa código: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingresa talla: ");
        String talla = scanner.nextLine();
        System.out.print("Ingresa marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingresa color: ");
        String color = scanner.nextLine();

        Producto nuevoProducto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
        productoServicio.agregarProducto(nuevoProducto);
        System.out.println("Producto agregado exitosamente.");
    }
    // Método main: punto de entrada cuando se ejecute el programa
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciar();
    }
}
