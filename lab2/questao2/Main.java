public class Main {
    public static void main(String[] args) {
        IVehicleMaker toyotaMaker = ToyotaSingleton.getInstance();
        IVehicleMaker hondaMaker = HondaSingleton.getInstance();

        IVehicle corolla = toyotaMaker.makeVehicle("Corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();

        IVehicle hilux = toyotaMaker.makeVehicle("Hilux");
        hilux.start();
        hilux.drive();
        hilux.stop();

        IVehicle city = hondaMaker.makeVehicle("City");
        city.start();
        city.drive();
        city.stop();

        IVehicle civic = hondaMaker.makeVehicle("Civic");
        civic.start();
        civic.drive();
        civic.stop();
    }
}
