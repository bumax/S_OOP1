import exercises.*;

public class Main {
    private static void runVehicle(Vehicle vl){
        System.out.println(vl);
        vl.run();
    }
    public static void main(String[] args) {

        Vehicle car_test = new Car("Зеленый");
        car_test.setWeight(1.1);
        Vehicle motorcycle_test = new Motorcycle("Красный");
        Vehicle truck_test = new Truck("Желтый", 5.5);
        truck_test.setWeight(10.5);
        Vehicle bicycle_test = new Bicycle("Пурпурный");

        runVehicle(car_test);
        runVehicle(motorcycle_test);
        runVehicle(truck_test);
        runVehicle(bicycle_test);




    }
}