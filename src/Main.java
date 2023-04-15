import exercises.*;

import java.util.ArrayList;

public class Main {
    private static void runVehicle(Vehicle vl) {
        vl.run();
        System.out.println(vl);
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Зеленый", "ВАЗ", 1.2));

        vehicles.add(new Motorcycle("Красный", "ЯВА", 0.3));
        vehicles.add(new Truck("Желтый", "КАМАЗ", 10.5));
        vehicles.add(new Bicycle("Пурпурный", "КАМА", 0.01));

        for (Vehicle ven : vehicles) {
            runVehicle(ven);
        }


    }
}