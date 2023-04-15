package exercises;

public class Motorcycle extends Vehicle{
    public Motorcycle(String inColor, String inModel, Double inWeight){
        super(inColor, inModel, 2, inWeight);
    }

    public void run(){
        super.setSpeed(120.0);
        super.run();
        System.out.println("Мотоцикл поехал со скоростью " + super.getSpeed() + " км/ч");
    }

}
