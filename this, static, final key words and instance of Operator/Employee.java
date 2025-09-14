package com.bridgelabz.oops.inbuiltfunction;

public class Employee {
	private static String companyName = "Tech Solutions Pvt Ltd";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;

    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee instance.");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "EMP001", "Manager");
        Employee emp2 = new Employee("Bob", "EMP002", "Developer");
        Employee emp3 = new Employee("Charlie", "EMP003", "Tester");

        System.out.println("\nEmployee 1 Details:");
        emp1.displayEmployeeDetails();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployeeDetails();

        System.out.println("\nEmployee 3 Details:");
        emp3.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}



