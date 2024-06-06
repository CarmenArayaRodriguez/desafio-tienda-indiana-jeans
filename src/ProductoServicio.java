import java.util.ArrayList;

public class ProductoServicio {
    private ArrayList<Producto> listaProductos;

    // Constructor de ProductoServicio
    public ProductoServicio() {
        listaProductos = new ArrayList<>();
    }

    // Getter para obtener la lista de productos
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    // Setter para establecer la lista de productos
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // Método para agregar un producto a la lista
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    // Método para listar todos los productos
    public void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }
}
