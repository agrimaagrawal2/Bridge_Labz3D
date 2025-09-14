package com.bridgelabz.oops.inbuiltfunction;

public class Product {
	private static double discount = 10.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: " + calculateTotal());
        } else {
            System.out.println("Invalid product instance.");
        }
    }

    public double calculateTotal() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 50000, 1);
        Product p2 = new Product("P002", "Smartphone", 20000, 2);

        System.out.println("\nProduct 1 Details:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();

        Product.updateDiscount(15);

        System.out.println("\nAfter updating discount:");
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}



