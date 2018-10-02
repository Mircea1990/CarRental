package ro.jademy.carrental.car.car_properties;

public enum  CarEngine {
    ONE_POINT_FOUR(1.4), ONE_POINT_EIGHT(1.8), TWO_LITRES(2.0);

    private double engineDisplasment;

    CarEngine(double engineDisplasment){
        this.engineDisplasment = engineDisplasment;
    }

    public double getEngineDisplasment(){
        return engineDisplasment;
    }
}
