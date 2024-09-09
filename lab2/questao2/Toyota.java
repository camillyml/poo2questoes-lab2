package lab2.questao2;
//implementação de toyota como Singleton
//garante que cada fabricante de veículos seja criado apenas uma vez
public class Toyota implements IVehicleMaker {
    private static Toyota instance;

    private Toyota() {}

    public static synchronized Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota();
        }
        return instance;
    }

    @Override
    public IVehicle makeVehicle(String model) {
        if (model.equals("Corolla")) {
            return new Corolla();
        } else if (model.equals("Hilux")) {
            return new Hilux();
        } else {
            throw new IllegalArgumentException("Model not available at Toyota");
        }
    }
}
