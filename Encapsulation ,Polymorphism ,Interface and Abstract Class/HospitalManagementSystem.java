package ProblemStatements;
import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int days;
    private List<String> records;

    public InPatient(String patientId, String name, int age, String diagnosis, double roomCharge, int days) {
        super(patientId, name, age, diagnosis);
        this.roomCharge = roomCharge;
        this.days = days;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return roomCharge * days + 500;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return records;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P101", "Ravi", 45, "Pneumonia", 2000, 5);
        Patient p2 = new OutPatient("P102", "Meera", 30, "Fever", 500);

        if (p1 instanceof MedicalRecord) {
            MedicalRecord m1 = (MedicalRecord) p1;
            m1.addRecord("Admitted on 10th Sept");
            m1.addRecord("Prescribed antibiotics");
            System.out.println(p1.getPatientDetails());
            System.out.println("Bill: " + p1.calculateBill());
            System.out.println("Records: " + m1.viewRecords());
        }

        System.out.println();

        if (p2 instanceof MedicalRecord) {
            MedicalRecord m2 = (MedicalRecord) p2;
            m2.addRecord("Visited on 12th Sept");
            m2.addRecord("Prescribed paracetamol");
            System.out.println(p2.getPatientDetails());
            System.out.println("Bill: " + p2.calculateBill());
            System.out.println("Records: " + m2.viewRecords());
        }
    }
}

