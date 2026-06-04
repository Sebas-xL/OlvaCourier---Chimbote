package Adapter;

class ServicioBilleteraDigital {
    private String nombreAplicacion; // Yape o plin

    public ServicioBilleteraDigital(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    // Método moderno que usa celular y que sistema viejo no entiende solo
    public void enviarTransferenciaPorCelular(String numeroCelular, double cantidad) {
        System.out.println("[" + nombreAplicacion.toUpperCase() + "] Validando transaccion del numero: " + numeroCelular);
        System.out.println("[" + nombreAplicacion.toUpperCase() + "] Dinero enviado con exito: S/." + cantidad);
    }
}