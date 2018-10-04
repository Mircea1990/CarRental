package ro.jademy.carrental.car.car_properties;

public enum  CarTransmision {
    FRONT("Front Transmision") ,
    BACK("Back Transmision"),
    ALLWHEEL("All Wheel Transmision");

    private String carTransmision;
    CarTransmision(String carTransmision){
        this.carTransmision = carTransmision;
    }

    public String getCarTransmision() {
        return carTransmision;
    }
}

