package ro.jademy.carrental.car.car_properties;

public enum  CarBodyType {
    SUV("Suv"), SEDAN("Sedan");

    private String bodyType;

    CarBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

}
