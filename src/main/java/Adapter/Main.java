package Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR COBROS EN CAMPO - OLVA COURIER ===");

        // Caso 1: Cobro en la oficina de la Av. Pardo
        System.out.println("SITUACIÓN 1: Pago en Efectivo en Ventanilla");
        System.out.println("====================================================");
        ReglaPagoOlva pagoOficina = new CajaTradicionalOlva();
        pagoOficina.registrarPago(45.50, "Envio de paquete comercial");
        System.out.println("====================================================");


        // Caso 2: cliente quiere pagar con YAPE
        System.out.println("SITUACIÓN 2: Pago con YAPE Contra Entrega");
        System.out.println("====================================================");
        
        // Aplicación de Yape
        ServicioBilleteraDigital appYape = new ServicioBilleteraDigital("Yape");
        
        // Adaptador
        ReglaPagoOlva cobroConYape = new Adaptador(appYape, "943123456");
        
        // Procesa el pago de forma normal
        cobroConYape.registrarPago(15.00, "Envio Express de documentos");
        System.out.println("====================================================");
    }
}