public class ToyotaSingleton implements IVehicleMaker {

    private static ToyotaSingleton instance;

    public static ToyotaSingleton getInstance() {
        if (instance == null) {
            instance = new ToyotaSingleton();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo) {
            case "Corolla":
                return new Corolla();
            case "Hilux":
                return new Hilux();
            default:
                throw new IllegalArgumentException("Modelo não disponível na Toyota.");
        }
    }
}

