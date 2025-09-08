package Constructors_InstanceVsClass_AccessModifiers;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "GL Bajaj";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 5000);
        c1.displayCourseDetails();
        Course.updateInstituteName("IIT Delhi");
        c1.displayCourseDetails();
    }
}
