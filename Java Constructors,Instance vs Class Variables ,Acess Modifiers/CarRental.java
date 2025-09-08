package Constructors_InstanceVsClass_AccessModifiers;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double costPerDay = 1000;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental("Ayush", "Honda City", 5);
        c1.display();
    }
}
