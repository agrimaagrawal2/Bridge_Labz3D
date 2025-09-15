package ProblemStatements;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

interface Discountable {
    double applyDiscount(double total);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.9;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg Items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.85;
    }

    @Override
    public String getDiscountDetails() {
        return "15% discount applied on Non-Veg Items";
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        double total = item.calculateTotalPrice();
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: " + total);
        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            double discounted = d.applyDiscount(total);
            System.out.println(d.getDiscountDetails());
            System.out.println("Price after Discount: " + discounted);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Biryani", 300, 1)
        };

        for (FoodItem item : order) {
            processOrder(item);
        }
    }
}

