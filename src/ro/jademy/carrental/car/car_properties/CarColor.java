package ro.jademy.carrental.car.car_properties;

public enum  CarColor {
    RED("Red"), GREEN("Green"), BLUE("Blue"), BLACK("Black");

    private String carColor;

    CarColor(String carColor){
        this.carColor = carColor;
    }
    public String getCarColor(){
        return carColor;
    }
}
