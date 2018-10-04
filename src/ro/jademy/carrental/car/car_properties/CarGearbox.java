package ro.jademy.carrental.car.car_properties;

public enum CarGearbox {
    MANUAL("Manual Gearbox"),
    AUTOMATIC("Automatic Gearbox");

    private String gearBox;

    CarGearbox(String gearBox) {
        this.gearBox = gearBox;
    }

    public String getGearBox() {
        return gearBox;
    }
}

