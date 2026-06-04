package AbstractFactory;

class Camioneta implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Despachando Camioneta...");
    }
}