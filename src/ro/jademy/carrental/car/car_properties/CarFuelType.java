package ro.jademy.carrental.car.car_properties;

public enum  CarFuelType {
    GASOLINE("Gasoline"), DIESEL("Diesel");

    private String fuelType;

    CarFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getGasoline() {
        return fuelType;
    }

}
