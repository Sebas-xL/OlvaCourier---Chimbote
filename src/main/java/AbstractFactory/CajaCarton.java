package AbstractFactory;

class CajaCarton implements Empaque {
    @Override
    public void envolver() {
        System.out.println("Empaquetando en Caja de Carton Corrugado...");
    }
}