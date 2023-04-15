package exercises;

public class Car extends Vehicle {
    public Car(String inColor, String inModel, Double inWeight) {
        super(inColor, inModel, 4, inWeight);

    }

    public void run() {
        super.setSpeed(60.0);
        super.run();
        System.out.println(super.getColor() + " автомобиль поехал");
    }

    @Override
    public String toString() {
        return "Car" + super.toString();
    }
}
