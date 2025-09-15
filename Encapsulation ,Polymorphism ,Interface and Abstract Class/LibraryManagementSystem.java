package ProblemStatements;
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            this.borrower = borrower;
            reserved = true;
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            this.borrower = borrower;
            reserved = true;
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            this.borrower = borrower;
            reserved = true;
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B101", "The Alchemist", "Paulo Coelho"),
            new Magazine("M201", "Science Weekly", "Editor A"),
            new DVD("D301", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("Alice");
                System.out.println("Available after reservation: " + r.checkAvailability());
            }
            System.out.println();
        }
    }
}


