package ro.jademy.carrental.car.car_factory;

import ro.jademy.carrental.car.car_properties.*;

import java.util.Calendar;
import java.util.Date;

public abstract class Car {
    private String model;
    private CarBodyType bodyType;
    private CarEngine engineDisplasment;
    private CarFuelType fuelType;
    private CarGearbox gearBox;
    private CarTransmision carTransmision;
    private CarColor carColor;
    private CarValue carValue;
    private boolean availableCar;
    private CarState carState = new CarState();

    public Car() {
        this.availableCar = false;
    }


    public Car(String model, CarBodyType bodyType, CarEngine engineDisplasment,
               CarFuelType fuelType, CarGearbox gearBox,
               CarTransmision carTransmision, CarColor carColor,
               CarValue carValue, boolean availableCar) {
        this.model = model;
        this.bodyType = bodyType;
        this.engineDisplasment = engineDisplasment;
        this.fuelType = fuelType;
        this.gearBox = gearBox;
        this.carTransmision = carTransmision;
        this.carColor = carColor;
        this.carValue = carValue;
        this.availableCar = availableCar;
    }

    public String getModel() {
        return model;
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

    public CarState getCarState() {
        return carState;
    }

    public void print() {
        System.out.format("%5s %15s %13s %16s %16s %16s %16s %16s %16s",
                getModel(), getBodyType().getBodyType(),
                getCarColor().getCarColor(),
                getCarTransmision().getCarTransmision(),
                getEngineDisplasment().getEngineDisplasment(),
                getFuelType().getGasoline(),
                getGearBox().getGearBox(), getCarValue().getCarValue(),
                isAvailableCar(), getCarState().isRented() ? "Is rented" : "Available");
    }

    public void rentCar(Date start, Date end) {
        carState.setRented(true);
        carState.setStarDate(start);
        carState.setEndDate(end);
    }
}

