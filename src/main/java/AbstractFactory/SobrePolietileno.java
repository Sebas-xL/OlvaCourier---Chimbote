package AbstractFactory;

class SobrePolietileno implements Empaque {
    @Override
    public void envolver() {
        System.out.println("Empaquetando en Sobre de Polietileno...");
    }
}