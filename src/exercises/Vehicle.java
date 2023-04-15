package exercises;

public class Vehicle {
    public Vehicle(String inColor, String inModel, Integer inWheelsNum, Double inWeight){
        color = inColor;
        model = inModel;
        wheelsNum = inWheelsNum;
        weight = inWeight;
    }
    private String color;
    private String model;
    private Integer wheelsNum;
    private Double weight;
    private Double speed;
    private Boolean isRun;
    public void run(){
        isRun = true;
    }
    public void stop(){
        speed = 0.0;
        isRun = false;
    }
    public Integer getWheels(){
        return  wheelsNum;
    }
    public void setModel(String inModel){
        model = inModel;
    }
    public String getModel(){
        return model;
    }

    public void setWeight(Double inWeight){
        weight = inWeight;
    }
    public Double getWeight(){
        return weight;
    }
    public void setSpeed(Double inSpeed){
        speed = inSpeed;
    }
    public Double getSpeed(){
        return speed;
    }
    public String getColor(){
        return color;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", wheelsNum=" + wheelsNum +
                ", weight=" + weight +
                ", speed=" + speed +
                ", isRun=" + isRun +
                '}';
    }
}
