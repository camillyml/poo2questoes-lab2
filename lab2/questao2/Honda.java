package lab2.questao2;
//implementação de honda como Singleton
public class Honda implements IVehicleMaker {
  
    @Override
    public IVehicle makeVehicle(String model) {
        if (model.equals("City")) {
            return new City();
        } else {
            throw new IllegalArgumentException("Model not available at Honda");
        }
    }
}
