package ro.jademy.carrental;

import ro.jademy.carrental.car.car_factory.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shop {

    public Shop() {
        salesmenList();
    }


    private List<Salesman> salesmenList = new ArrayList<>();

    public void salesmenList() {

        Salesman salesman1 = new Salesman("John", "Brandon",
                "user001", "pass1");
        Salesman salesman2 = new Salesman("Rocky", "Balboa",
                "user002", "pass2");
        Salesman salesman3 = new Salesman("Apollo", "Creed",
                "user003", "pass3");
        Collections.addAll(salesmenList, salesman1, salesman2, salesman3);

    }

    public boolean login(String username, String password) {

        for (Salesman s : salesmenList) {
            if (s.getUserName().equals(username) &&
                    s.getPass().equals(password)) {
                System.out.println("You are logged");
                return true;
            }
        }
        return false;
    }

    public void showWhelcome() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
    }

    public void showMainMenu() {
        System.out.println(" -----------------------------------------------");
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars--------------------------------");
        System.out.println("2. List available cars--------------------------");
        System.out.println("3. List rented cars-----------------------------");
        System.out.println("4. Check income---------------------------------");
        System.out.println("5. Logout---------------------------------------");
        System.out.println("6. Exit-----------------------------------------");
        System.out.println("------------------------------------------------");
    }

    public void mainMenuChoise() {
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                showAllCars();
                break;
            case 2:
                listAvailableCars();
                break;
            case 3:
                listRentedCars();
                break;
            case 4:
                checkIncome();
            case 5:
                logOut();
            case 6:
                exitProgram();
        }
    }

    public void showAllCars() {
        List<Car> carList = new ArrayList<>();
        for (Car car : carList) {
            car.showCars();
        }

    }

    public void listAvailableCars(){

    }

    public void listRentedCars(){

    }

    public void checkIncome(){

    }

    public void logOut(){

    }

    public void exitProgram(){

    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }

    public void run() {
        showWhelcome();
        System.out.println("Please enter your username");
        Scanner scan = new Scanner(System.in);
        String user = scan.next();
        System.out.println("Please enter your password");
        String pas = scan.next();
        if (login(user, pas)) {
            showMainMenu();
        } else {
            showLoginError();
        }
    }

    public void showLoginError() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" -----------------------------------------------");
        System.out.println(" ------------Login not successful---------------");
        System.out.println(" ------------Please choose a option-------------");
        System.out.println(" ------------1. Try again ----------------------");
        System.out.println(" ------------2. Exit program -------------------");
        System.out.println(" -----------------------------------------------");
        int choose = scan.nextInt();
        if (choose == 1) {
            showWhelcome();
            run();
        } else if (choose == 2) {
            System.exit(0);
        }
    }
}