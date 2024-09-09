package lab2.questao2;

public class Main {
    public static void main(String[] args) {
         //obtendo instâncias Singleton dos fabricantes
        IVehicleMaker toyotaMaker = Toyota.getInstance();
        IVehicleMaker hondaMaker = Honda.getInstance();
        
         //fabricando e utilizando veículos Toyota
       IVehicle corolla = toyotaMaker.makeVehicle("Corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();
        
        IVehicle hilux = toyotaMaker.makeVehicle("Hilux");
        hilux.start();
        hilux.drive();
        hilux.stop();
        
        //fabricando e utilizando veículos Honda
        IVehicle city = hondaMaker.makeVehicle("City");
        city.start();
        city.drive();
        city.stop();
    }
}
