package Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("=== CONEXIONES EN HORA PUNTA - OLVA COURIER ===");
        System.out.println("=========================================");
        
        System.out.println("contexto 1: Usuario de Nuevo Chimbote entra a la web a revisar su tracking");
        // Primera conexion
        ConexionBaseDatos conexionCliente = ConexionBaseDatos.obtenerInstancia();
        conexionCliente.consultarTracking("OLVA-99411", "Usuario 01");
        System.out.println("=========================================");

        System.out.println("contexto 2: Repartidor en la Av. Pardo actualiza el estado de una entrega");
        // El repartidor pide la conexión
        ConexionBaseDatos conexionRepartidor = ConexionBaseDatos.obtenerInstancia();
        conexionRepartidor.consultarTracking("OLVA-10254", "Repartidor 06");
        System.out.println("=========================================");

        System.out.println("contexto 3: La secretaria en ventanilla registra un nuevo envío pesado");
        // La oficina vuelve a pedir la conexión
        ConexionBaseDatos conexionVentanilla = ConexionBaseDatos.obtenerInstancia();
        conexionVentanilla.consultarTracking("OLVA-55822", "Ventanilla 03");
        System.out.println("=========================================");

        System.out.println("VERIFICACIÓN DEL PATRÓN SINGLETON");
        if (conexionCliente == conexionRepartidor && conexionRepartidor == conexionVentanilla) {
            System.out.println("Las tres variables apuntan a la misma instancia en memoria.");
            System.out.println("El servidor de Olva Courier Solo generó 1 conexión.");
        } else {
            System.out.println("Error 404....Se crearon múltiples conexiones.");
        }
    }
}