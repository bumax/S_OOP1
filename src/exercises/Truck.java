package exercises;

public class Truck extends Vehicle {
    public Truck(String inColor, Double inWeight) {
        weight = inWeight;
        color = inColor;
        wheelsNum = 10;
    }

    public void run() {
        speed = 40.0;
        super.run();
        System.out.println("Грузовик, массой " + weight + "т, поехал");
    }
}
