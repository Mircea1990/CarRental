package ro.jademy.carrental.car.car_factory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarState {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat();
    private boolean isRented = false;
    private Date starDate;
    private Date endDate;

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

   public void printState(){
       System.out.format("%10s"+getStarDate(),getEndDate());
   }
}
