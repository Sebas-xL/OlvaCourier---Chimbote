package Adapter;

class Adaptador implements ReglaPagoOlva {
    private ServicioBilleteraDigital billetera;
    private String celularDelCliente;

    public Adaptador(ServicioBilleteraDigital billetera, String celularDelCliente) {
        this.billetera = billetera;
        this.celularDelCliente = celularDelCliente;
    }

    // Conexion del metodo antiguo con el moderno / ADAPTER
    @Override
    public void registrarPago(double monto, String descripcion) {
        System.out.println(" Convirtiendo orden de cobro de Olva para Yape/Plin...");
        // Llama al método de la billetera digital usando sus propios parámetros
        billetera.enviarTransferenciaPorCelular(celularDelCliente, monto);
    }
}