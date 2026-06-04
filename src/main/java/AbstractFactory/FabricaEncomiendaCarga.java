package AbstractFactory;

class FabricaEncomiendaCarga extends FabricaLogistica {
    @Override
    public Vehiculo crearVehiculo() {
        return new Camioneta();
    }

    @Override
    public Empaque crearEmpaque() {
        return new CajaCarton();
    }
}