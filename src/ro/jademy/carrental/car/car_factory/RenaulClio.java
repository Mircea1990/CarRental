package ro.jademy.carrental.car.car_factory;

import ro.jademy.carrental.car.car_properties.CarColor;
import ro.jademy.carrental.car.car_properties.CarBodyType;
import ro.jademy.carrental.car.car_properties.CarEngine;
import ro.jademy.carrental.car.car_properties.CarFuelType;
import ro.jademy.carrental.car.car_properties.CarGearbox;
import ro.jademy.carrental.car.car_properties.CarTransmision;
import ro.jademy.carrental.car.car_properties.CarValue;

public class RenaulClio extends Renault {

    public RenaulClio(CarBodyType bodyType, CarEngine engineDisplasment,
                      CarFuelType fuelType, CarGearbox gearBox,
                      CarTransmision carTransmision, CarColor carColor,
                      CarValue carValue, boolean availableCar) {
        super(CarBodyType.SEDAN,CarEngine.ONE_POINT_EIGHT,CarFuelType.DIESEL,
                CarGearbox.AUTOMATIC, CarTransmision.BACK, CarColor.GREEN,
                CarValue.VAL1,availableCar);
    }
}
