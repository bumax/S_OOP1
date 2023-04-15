package exercises;

public class Truck extends Vehicle {

    public Truck(String inColor, String inModel, Double inWeight) {
        super(inColor, inModel, 10, inWeight);
    }

    public void run() {
        super.setSpeed(40.0);
        super.run();
        System.out.println("Грузовик, массой " + super.getWeight() + "т, поехал");
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }
}
