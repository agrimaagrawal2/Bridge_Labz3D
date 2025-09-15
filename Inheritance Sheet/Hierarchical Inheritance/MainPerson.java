package HierarchicalInheritance;
public class MainPerson {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice", 35, "Mathematics");
        Student s1 = new Student("Bob", 16, "10th Grade");
        Staff st1 = new Staff("Charlie", 40, "Administration");

        t1.displayRole();
        s1.displayRole();
        st1.displayRole();
    }
}
