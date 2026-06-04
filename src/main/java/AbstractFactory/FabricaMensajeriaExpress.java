package AbstractFactory;

class FabricaMensajeriaExpress extends FabricaLogistica {
    @Override
    public Vehiculo crearVehiculo() {
        return new Motocicleta();
    }

    @Override
    public Empaque crearEmpaque() {
        return new SobrePolietileno();
    }
}