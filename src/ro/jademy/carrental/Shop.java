package ro.jademy.carrental;

import ro.jademy.carrental.car.car_factory.Car;
import ro.jademy.carrental.car.car_factory.CarState;
import ro.jademy.carrental.car.car_factory.Renault;
import ro.jademy.carrental.car.car_factory.Suzuki;
import ro.jademy.carrental.car.car_properties.*;

import java.util.*;

public class Shop {
    Scanner scan = new Scanner(System.in);
    private List<Car> carList = new ArrayList<>();
    private List<Salesman> salesmenList = new ArrayList<>();

    public Shop() {
        initSalesmenList();
        initCarList();
    }

    public void initSalesmenList() {

        Salesman salesman1 = new Salesman("John", "Brandon",
                "user001", "pass1");
        Salesman salesman2 = new Salesman("Rocky", "Balboa",
                "user002", "pass2");
        Salesman salesman3 = new Salesman("Apollo", "Creed",
                "user003", "pass3");
        Collections.addAll(salesmenList, salesman1, salesman2, salesman3);
    }

    private void initCarList() {

        carList.add(new Renault("Renault Clio",
                CarBodyType.SUV, CarEngine.ONE_POINT_FOUR, CarFuelType.DIESEL, CarGearbox.MANUAL, CarTransmision.FRONT, CarColor.BLUE, CarValue.VAL2, true));
        carList.add(new Renault("Renault Megane",
                CarBodyType.SEDAN, CarEngine.TWO_LITRES, CarFuelType.GASOLINE, CarGearbox.AUTOMATIC, CarTransmision.ALLWHEEL, CarColor.GREEN, CarValue.VAL1, false));
        carList.add(new Renault("Renault Kadjar",
                CarBodyType.SUV, CarEngine.TWO_LITRES, CarFuelType.GASOLINE, CarGearbox.MANUAL, CarTransmision.ALLWHEEL, CarColor.BLACK, CarValue.VAL3, true));
        carList.add(new Suzuki("Suzuki SX4",
                CarBodyType.SUV, CarEngine.ONE_POINT_FOUR, CarFuelType.GASOLINE, CarGearbox.MANUAL, CarTransmision.ALLWHEEL, CarColor.GREEN, CarValue.VAL1, false) {
        });
        carList.add(new Suzuki("Suzuki Vitara",
                CarBodyType.SUV, CarEngine.TWO_LITRES, CarFuelType.DIESEL, CarGearbox.AUTOMATIC, CarTransmision.ALLWHEEL, CarColor.BLUE, CarValue.VAL2, true) {
        });
        carList.add(new Suzuki("Suzuki Swift",
                CarBodyType.SEDAN, CarEngine.ONE_POINT_FOUR, CarFuelType.GASOLINE, CarGearbox.AUTOMATIC, CarTransmision.FRONT, CarColor.RED, CarValue.VAL3, false) {
        });
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
        System.out.println();
        System.out.println();
        System.out.println("----------Please choose an option---------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println();
        System.out.println("1. List all cars--------------------------------");
        System.out.println("2. List available cars--------------------------");
        System.out.println("3. List rented cars-----------------------------");
        System.out.println("4. Check income---------------------------------");
        System.out.println("5. Logout---------------------------------------");
        System.out.println("6. Exit-----------------------------------------");
        System.out.println("------------------------------------------------");
        mainMenuChoise();
    }

    public void mainMenuChoise() {

        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                showAllCars();
                backToMenu();
                break;
            case 2:
                listAvailableCars();
                backToMenu();
                break;
            case 3:
                listRentedCars();
                backToMenu();
                break;
            case 4:
                checkIncome();
                backToMenu();
            case 5:
                logOut();
            case 6:
                exitProgram();
        }
    }

    public void backToMenu() {
        System.out.println("");
        System.out.println("0:Back to menu");
        int choise = scan.nextInt();
        if (choise == 0) {
            showMainMenu();
        }
    }

    public void showAllCars() {
        header();
        for (Car car : carList) {
            car.print();
            System.out.println();
        }
    }

    private void header() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%12s %18s %13s %16s %16s %16s %16s %16s %16s", "MODEL", "CAR BODY TYPE", "COLOR", "TRANSMISSION", "ENGINE TYPE", "FUEL TYPE", "GEARBOX TYPE", "CAR PRICE/HOUR", "AVAILABILITY");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void listAvailableCars() {
        System.out.println("---------------Available cars-------------------");
        header();
        for (Car car : carList) {
            if (car.isAvailableCar()) {
                car.print();
                System.out.println();
            }
        }
    }

    public void listRentedCars() {
        System.out.println("---------------Rented cars-------------------");
        header();
        for (Car car : carList) {
            if (!car.isAvailableCar()) {
                car.print();
                System.out.println();
            }
        }
    }

    public void checkTimeRent() {
        for (Car car : carList) {
            if (!car.isAvailableCar()) {

            }
        }

    }

    public void checkIncome() {
        System.out.println("---------------Income money/hour-------------------");
    }

    public void logOut() {
        System.out.println("You are logged out !");
        System.out.println("Do you whant to logged again?");
        System.out.println("If yes, press y");
        String s = scan.next();
        if (s.equals("y") || s.equals("Y")) {
            System.out.println("You can loggin again");
            run();
        }
    }

    public void exitProgram() {
        System.exit(0);
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