package ProblemStatements;
import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = 0;
            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Product: " + p.getName() + ", Price: " + p.getPrice() + ", Discount: " + discount + ", Tax: " + tax + ", Final Price: " + finalPrice);
            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
            }
            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Shirt", 2000));
        products.add(new Groceries(3, "Rice", 1000));

        printFinalPrices(products);
    }
}

