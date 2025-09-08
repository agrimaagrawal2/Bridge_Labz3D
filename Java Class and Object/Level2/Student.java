package level2;

public class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 101, 89.5);
        Student s2 = new Student("Simran", 102, 91.0);

        s1.displayStudent();
        s2.displayStudent();
    }
}
