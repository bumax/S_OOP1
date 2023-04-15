package exercises;

public class Bicycle extends Vehicle {
    public Bicycle(String inColor, String inModel, Double inWeight) {
        super(inColor, inModel, 3, inWeight);
    }

    public void run() {
        super.setSpeed(10.0);
        super.run();
        System.out.println(super.getColor() + " велосипед поехал со скоростью " + super.getSpeed() + " км/ч");
    }

    @Override
    public String toString() {
        return "Bicycle" + super.toString();
    }
}
