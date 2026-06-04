package AbstractFactory;

class Motocicleta implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Despachando Motocicleta...");
    }
}