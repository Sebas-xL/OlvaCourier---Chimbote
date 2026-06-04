package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ASIGNACIÓN LOGÍSTICA - OLVA COURIER ===");
        System.out.println("===================================");
        
        // Caso 1: Enviar un documento Express
        System.out.println("Procesando envio 1: Documento a Trujillo");
        FabricaLogistica express = new FabricaMensajeriaExpress();
        
        Empaque empaque1 = express.crearEmpaque();
        Vehiculo vehiculo1 = express.crearVehiculo();
        
        empaque1.envolver();
        vehiculo1.conducir();
        System.out.println("Recursos asignados correctamente...");

        System.out.println("===================================");
        // Caso 2: Enviar una caja con mercadería Encomienda
        System.out.println("procesando envio 2: Caja de Ropa");
        FabricaLogistica pesado = new FabricaEncomiendaCarga();
        
        Empaque empaque2 = pesado.crearEmpaque();
        Vehiculo vehiculo2 = pesado.crearVehiculo();
        
        empaque2.envolver();
        vehiculo2.conducir();
        System.out.println("Recursos asignados correctamente...");
        System.out.println("===================================");
    }
}