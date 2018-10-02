package ro.jademy.carrental.car.car_properties;

public enum  CarTransmision {
    FRONT("FrontTransmision") ,
    BACK("BackTransmision"),
    ALLWHEEL("AllWheelTransmision");

    private String carTransmision;
    CarTransmision(String carTransmision){
        this.carTransmision = carTransmision;
    }

    public String getCarTransmision() {
        return carTransmision;
    }
}

