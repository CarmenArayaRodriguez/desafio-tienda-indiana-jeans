import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExportarTxt extends Exportador {
    @Override
    public void exportar(ArrayList<Producto> productos) {
        SimpleDateFormat formateador = new SimpleDateFormat("yyyyMMddHHmmss");
        String fechaComoCadena = formateador.format(new Date());
        // Nombre del directorio donde se guardarán los archivos
        String nombreDirectorio = "productos";
        File directorio = new File(nombreDirectorio);

        // SE verifica si el directorio existe, y si no, intenta crearlo
        if (!directorio.exists()) {
            // Crea el directorio
            directorio.mkdir();
        }

        String nombreArchivo = nombreDirectorio + "/productos_" + fechaComoCadena + ".txt"; // Construye el nombre del archivo

        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            for (Producto producto : productos) {
                escritor.write("Artículo: " + producto.getArticulo() + "\n");
                escritor.write("Precio: " + producto.getPrecio() + "\n");
                escritor.write("Descripción: " + producto.getDescripcion() + "\n");
                escritor.write("Código: " + producto.getCodigo() + "\n");
                escritor.write("Talla: " + producto.getTalla() + "\n");
                escritor.write("Marca: " + producto.getMarca() + "\n");
                escritor.write("Color: " + producto.getColor() + "\n");
                escritor.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
