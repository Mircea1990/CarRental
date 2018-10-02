package ro.jademy.carrental.car.car_factory;

import ro.jademy.carrental.car.car_properties.*;


public abstract class Renault extends Car {
    public Renault(CarBodyType bodyType, CarEngine engineDisplasment,
                   CarFuelType fuelType, CarGearbox gearBox,
                   CarTransmision carTransmision, CarColor carColor,
                   CarValue carValue, boolean availableCar) {
        super(bodyType, engineDisplasment, fuelType, gearBox,
                carTransmision, carColor, carValue, availableCar);
    }
}
