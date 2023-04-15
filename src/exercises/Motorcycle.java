package exercises;

public class Motorcycle extends Vehicle{
    public Motorcycle(String inColor){
        color = inColor;
        wheelsNum = 2;
    }

    public void run(){
        speed = 120.0;
        super.run();
        System.out.println("Мотоцикл поехал со скоростью " + speed + " км/ч");
    }

}
