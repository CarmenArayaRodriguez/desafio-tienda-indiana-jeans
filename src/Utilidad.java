public class Utilidad {
    // Método para limpiar la pantalla
    public static void limpiezaDePantalla() {
        // SE envía una secuencia de escape para mover el cursor al inicio de la pantalla
        System.out.print("\033[H");
        // Se envía una secuencia de escape para borrar toda la pantalla dede la posición del cursor
        System.out.print("\033[2J");
        // Se fuerza la salida de los comandos anteriores para asegurarse de que se ejecutan de inmediato
        System.out.flush();
    }

    // Método para pausar la ejecución durante un tiempo especificado
    public static void tiempoDeEspera(int tiempo) {
        try {
            // Se pausa la ejecución del programa durante el número de milisegundos especificados
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            // Se maneja cualquier interrupción imprimiendo un mensaje de error
            System.out.println("Interrupción en la espera: " + e.getMessage());
        }
    }
}
