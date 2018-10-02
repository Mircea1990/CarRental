package ro.jademy.carrental.car.car_factory;
import ro.jademy.carrental.car.car_properties.*;

public class SuzukiSX4 extends Suzuki{
    public SuzukiSX4(CarBodyType bodyType, CarEngine engineDisplasment,
                     CarFuelType fuelType, CarGearbox gearBox,
                     CarTransmision carTransmision, CarColor carColor,
                     CarValue carValue, boolean availableCar) {
        super(CarBodyType.SUV, CarEngine.ONE_POINT_FOUR, CarFuelType.GASOLINE,
                CarGearbox.AUTOMATIC, CarTransmision.ALLWHEEL,
                CarColor.BLUE, CarValue.VAL2, availableCar);
    }
}
