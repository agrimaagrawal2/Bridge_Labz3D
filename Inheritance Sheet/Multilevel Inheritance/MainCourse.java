package MultilevelInheritance;
public class MainCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 10);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Data Science", 12, "Coursera", true, 5000, 20);

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}
