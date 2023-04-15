package exercises;

public class Car extends Vehicle {
    public Car(String inColor){
        color = inColor;
        wheelsNum = 4;
    }
    public void run(){
        speed = 60.0;
        super.run();
        System.out.println(color + " автомобиль поехал");
    }
//    protected Integer wheelsNum = 4;
}
