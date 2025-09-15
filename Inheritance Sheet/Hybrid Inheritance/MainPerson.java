package HybridInheritance;
public class MainPerson {
    public static void main(String[] args) {
        Chef c1 = new Chef("Mahi", 101, "Italian");
        Waiter w1 = new Waiter("Bhumi", 201, 5);

        c1.displayInfo();
        c1.performDuties();

        w1.displayInfo();
        w1.performDuties();
    }
}
