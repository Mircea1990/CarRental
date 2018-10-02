package ro.jademy.carrental.car.car_factory;
import ro.jademy.carrental.car.car_properties.*;

public abstract class Car {
    private CarBodyType bodyType;
    private CarEngine engineDisplasment;
    private CarFuelType fuelType;
    private CarGearbox gearBox;
    private CarTransmision carTransmision;
    private CarColor carColor;
    private CarValue carValue;
    private boolean availableCar;

    public Car() {
        this.availableCar = false;
    }


    public Car(CarBodyType bodyType, CarEngine engineDisplasment,
               CarFuelType fuelType, CarGearbox gearBox,
               CarTransmision carTransmision, CarColor carColor,
               CarValue carValue, boolean availableCar) {
        this.bodyType = bodyType;
        this.engineDisplasment = engineDisplasment;
        this.fuelType = fuelType;
        this.gearBox = gearBox;
        this.carTransmision = carTransmision;
        this.carColor = carColor;
        this.carValue = carValue;
        this.availableCar = availableCar;

    }

    public CarBodyType getBodyType() {
        return bodyType;
    }

    public CarEngine getEngineDisplasment() {
        return engineDisplasment;
    }

    public CarFuelType getFuelType() {
        return fuelType;
    }

    public CarGearbox getGearBox() {
        return gearBox;
    }

    public CarTransmision getCarTransmision() {
        return carTransmision;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public CarValue getCarValue() {
        return carValue;
    }

    public boolean isAvailableCar() {
        return availableCar;
    }

    @Override
    public String toString() {
        return "Car specifications: " +
                "bodyType=" + bodyType +
                ", engineDisplasment=" + engineDisplasment +
                ", fuelType=" + fuelType +
                ", gearBox=" + gearBox +
                ", carTransmision=" + carTransmision +
                ", carColor=" + carColor +
                ", carValue=" + carValue +
                ", availableCar=" + availableCar +
                '}';
    }

    public void showCars(){
        System.out.println("All cars in store: ");
        String show = String.format("%-12%s-12%s-12%s-12%s-12%s-12%s-12%s-12%s," +
                bodyType,engineDisplasment,fuelType,gearBox,carTransmision,carColor,
        carValue,availableCar);
        System.out.println(show);
    }
}

