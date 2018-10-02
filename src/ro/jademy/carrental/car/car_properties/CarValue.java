package ro.jademy.carrental.car.car_properties;

public enum CarValue {
   VAL1(15000),VAL2(20000),VAL3(25000);

   private int carValue;

    CarValue(int carValue) {
        this.carValue = carValue;
    }

    public int getCarValue() {
        return carValue;
    }
}
