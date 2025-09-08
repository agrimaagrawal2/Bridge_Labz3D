package level2;

public class Laptop {
    String brand;
    String processor;
    double price;

    Laptop(String brand, String processor, double price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    public void displayLaptop() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP", "Intel i5", 55000);
        Laptop l2 = new Laptop("Dell", "Intel i7", 75000);

        l1.displayLaptop();
        l2.displayLaptop();
    }
}
