package ro.jademy.carrental.car.car_properties;

public enum  CarColor {
    RED("red"), GREEN("green"), BLUE("blue"), BLACK("black");

    private String carColor;

    CarColor(String carColor){
        this.carColor = carColor;
    }
    public String getCarColor(){
        return carColor;
    }
}
