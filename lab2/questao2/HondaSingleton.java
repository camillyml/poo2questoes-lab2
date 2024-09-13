public class HondaSingleton implements IVehicleMaker {
   
    private static HondaSingleton instance;

    public static HondaSingleton getInstance() {
        if (instance == null) {
            instance = new HondaSingleton();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String modelo) {
        switch (modelo) {
            case "City":
                return new City();
            case "Civic":
                return new Civic();
            default:
                throw new IllegalArgumentException("Modelo não disponível na Honda.");
        }
    }
}