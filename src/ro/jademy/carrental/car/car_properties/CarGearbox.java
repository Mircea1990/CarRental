package ro.jademy.carrental.car.car_properties;

public enum CarGearbox {
    MANUAL("ManualGearbox"),
    AUTOMATIC("AutomaticGearbox");

    private String gearBox;

    CarGearbox(String gearBox) {
        this.gearBox = gearBox;
    }


}
