public class Hilux implements IVehicle {
    @Override
    public void start() {
        System.out.println("Hilux está ligada.");
    }

    @Override
    public void drive() {
        System.out.println("Hilux está rodando.");
    }

    @Override
    public void stop() {
        System.out.println("Hilux está parada.");
    }
}
