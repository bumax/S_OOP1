package exercises;

public class Vehicle {
    public Vehicle(){
        wheelsNum = null;
    }
    protected String color;
    protected String model;
    protected Integer wheelsNum;
    protected Double weight;
    protected Double speed;
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

    public Double getSpeed(){
        return speed;
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
