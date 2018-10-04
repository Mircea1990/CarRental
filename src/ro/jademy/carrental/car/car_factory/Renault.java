package ro.jademy.carrental.car.car_factory;
import ro.jademy.carrental.car.car_properties.*;
import java.util.Calendar;


public class Renault extends Car {
    public Renault(String model, CarBodyType bodyType,
                   CarEngine engineDisplasment, CarFuelType fuelType,
                   CarGearbox gearBox, CarTransmision carTransmision,
                   CarColor carColor, CarValue carValue, boolean availableCar) {
        super(model, bodyType, engineDisplasment,
                fuelType, gearBox, carTransmision, carColor,
                carValue, availableCar);
    }
}
