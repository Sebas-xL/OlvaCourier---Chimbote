package Singleton;

class ConexionBaseDatos {  
    // Guardamos la única instancia aquí adentro
    private static ConexionBaseDatos unicaInstancia;
    private static int contadorConexiones = 0;

    // Constructor privado
    private ConexionBaseDatos(){
        contadorConexiones++;
        System.out.println("Instancia creada...Conexión abierta con la Base de Datos.");
        System.out.println("Total de conexiones activas en memoria: " + contadorConexiones);
    }

    // Método publico y estatico
    public static ConexionBaseDatos obtenerInstancia() {
        if (unicaInstancia == null) {
            unicaInstancia = new ConexionBaseDatos();
        }
        return unicaInstancia;
    }

    public void consultarTracking(String codigoPaquete, String usuario) {
        System.out.println("[" + usuario + "] Consultando paquete " + codigoPaquete + " usando la conexion");
    }
}