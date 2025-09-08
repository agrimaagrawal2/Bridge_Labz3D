package level2;

public class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Car c1 = new Car("Hyundai", "i20", 2023);
        Car c2 = new Car("Tata", "Harrier", 2022);

        c1.displayCar();
        c2.displayCar();
    }
}

