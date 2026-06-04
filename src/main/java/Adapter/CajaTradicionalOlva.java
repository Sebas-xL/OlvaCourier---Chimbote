package Adapter;

class CajaTradicionalOlva implements ReglaPagoOlva {
    @Override
    public void registrarPago(double monto, String descripcion) {
        System.out.println("Procesando pago en caja tradicional...");
        System.out.println("Confirmado: S/." + monto + " | Motivo: " + descripcion);
    }
}