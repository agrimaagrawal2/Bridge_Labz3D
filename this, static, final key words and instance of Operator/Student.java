package com.bridgelabz.oops.inbuiltfunction;

public class Student {
	 private static String universityName = "Global University";
	    private static int totalStudents = 0;
	    private final String rollNumber;
	    private String name;
	    private String grade;

	    public Student(String name, String rollNumber, String grade) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	        totalStudents++;
	    }

	    public static void displayTotalStudents() {
	        System.out.println("Total Students: " + totalStudents);
	    }

	    public void displayStudentDetails() {
	        if (this instanceof Student) {
	            System.out.println("University: " + universityName);
	            System.out.println("Name: " + name);
	            System.out.println("Roll Number: " + rollNumber);
	            System.out.println("Grade: " + grade);
	        } else {
	            System.out.println("Invalid student instance.");
	        }
	    }

	    public void updateGrade(String newGrade) {
	        if (this instanceof Student) {
	            this.grade = newGrade;
	            System.out.println("Grade updated to: " + grade);
	        } else {
	            System.out.println("Invalid student instance.");
	        }
	    }

	    public static void main(String[] args) {
	        Student s1 = new Student("Arjun", "S001", "A");
	        Student s2 = new Student("Meera", "S002", "B");

	        System.out.println("\nStudent 1 Details:");
	        s1.displayStudentDetails();

	        System.out.println("\nStudent 2 Details:");
	        s2.displayStudentDetails();

	        Student.displayTotalStudents();

	        System.out.println("\nUpdating grade for Student 2:");
	        s2.updateGrade("A+");
	        s2.displayStudentDetails();
	    }
	}


