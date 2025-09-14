package com.bridgelabz.oops.inbuiltfunction;

public class Patient {
	private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient instance.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Rahul", 30, "Fever", "P001");
        Patient p2 = new Patient("Anita", 45, "Diabetes", "P002");

        System.out.println("\nPatient 1 Details:");
        p1.displayPatientDetails();

        System.out.println("\nPatient 2 Details:");
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }


}
