package lab2.questao2;
//interface para fabricantes de veículos

//o padrão Factory permite a criação de diferentes tipos de veículos sem dependência direta ao código que os usa
interface IVehicleMaker {
    IVehicle makeVehicle(String model);
}
