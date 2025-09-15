package ProblemStatements;
import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + policyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + policyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.20;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + policyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 2000, "C-101"));
        vehicles.add(new Bike("BIKE456", 500, "B-202"));
        vehicles.add(new Truck("TRUCK789", 3000, "T-303"));

        int days = 5;

        for (Vehicle v : vehicles) {
            double rentalCost = v.calculateRentalCost(days);
            double insurance = 0;
            String insuranceDetails = "Not Insurable";
            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
                insuranceDetails = ((Insurable) v).getInsuranceDetails();
            }
            System.out.println("Vehicle: " + v.getType() + ", Number: " + v.getVehicleNumber());
            System.out.println("Rental for " + days + " days: " + rentalCost);
            System.out.println("Insurance: " + insurance);
            System.out.println(insuranceDetails);
            System.out.println("-----------");
        }
    }
}

