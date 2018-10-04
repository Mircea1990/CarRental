package ro.jademy.carrental.car.car_properties;

public enum CarValue {
   VAL1(15),VAL2(20),VAL3(25);

   private int carValue;

    CarValue(int carValue) {
        this.carValue = carValue;
    }

    public int getCarValue() {
        return carValue;
    }
}
