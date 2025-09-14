package com.bridgelabz.oops.inbuiltfunction;

public class Vehicle {
	 private static double registrationFee = 5000.0;
	    private final String registrationNumber;
	    private String ownerName;
	    private String vehicleType;

	    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	        this.registrationNumber = registrationNumber;
	    }

	    public static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }

	    public void displayVehicleDetails() {
	        if (this instanceof Vehicle) {
	            System.out.println("Owner Name: " + ownerName);
	            System.out.println("Vehicle Type: " + vehicleType);
	            System.out.println("Registration Number: " + registrationNumber);
	            System.out.println("Registration Fee: " + registrationFee);
	        } else {
	            System.out.println("Invalid vehicle instance.");
	        }
	    }

	    public static void main(String[] args) {
	        Vehicle v1 = new Vehicle("Rohit Sharma", "Car", "REG1234");
	        Vehicle v2 = new Vehicle("Virat Kohli", "Bike", "REG5678");

	        System.out.println("\nVehicle 1 Details:");
	        v1.displayVehicleDetails();

	        System.out.println("\nVehicle 2 Details:");
	        v2.displayVehicleDetails();

	        Vehicle.updateRegistrationFee(6000);

	        System.out.println("\nAfter updating registration fee:");
	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();
	    }
	}


