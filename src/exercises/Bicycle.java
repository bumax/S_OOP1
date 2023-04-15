package exercises;

public class Bicycle extends Vehicle {
    public Bicycle(String inColor) {
        color = inColor;
        wheelsNum = 3;
    }

    public void run() {
        speed = 10.0;
        super.run();
        System.out.println(color + " велосипед поехал со скоростью " + speed + " км/ч");
    }
}
