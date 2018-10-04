package ro.jademy.carrental.car.car_factory;
import  ro.jademy.carrental.car.car_properties.*;
import java.util.Calendar;

public abstract class Suzuki extends Car {
    public Suzuki(String model, CarBodyType bodyType,
                  CarEngine engineDisplasment, CarFuelType fuelType,
                  CarGearbox gearBox, CarTransmision carTransmision,
                  CarColor carColor, CarValue carValue, boolean availableCar) {
        super(model, bodyType, engineDisplasment,
                fuelType, gearBox, carTransmision,
                carColor, carValue, availableCar);
    }
}
