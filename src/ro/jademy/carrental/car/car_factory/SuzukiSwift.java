package ro.jademy.carrental.car.car_factory;
import ro.jademy.carrental.car.car_properties.*;

public class SuzukiSwift extends Suzuki  {
    public SuzukiSwift(CarBodyType bodyType, CarEngine engineDisplasment,
                       CarFuelType fuelType, CarGearbox gearBox,
                       CarTransmision carTransmision, CarColor carColor,
                       CarValue carValue, boolean availableCar) {
        super(CarBodyType.SEDAN, CarEngine.ONE_POINT_EIGHT, CarFuelType.DIESEL,
                CarGearbox.MANUAL, CarTransmision.FRONT,
                CarColor.GREEN, CarValue.VAL1, availableCar);
    }
}
