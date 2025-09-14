package com.bridgelabz.oops.inbuiltfunction;

public class Book {
	 private static String libraryName = "City Central Library";
	    private final String isbn;
	    private String title;
	    private String author;

	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	    public static void displayLibraryName() {
	        System.out.println("Library Name: " + libraryName);
	    }

	    public void displayBookDetails() {
	        if (this instanceof Book) {
	            System.out.println("Library: " + libraryName);
	            System.out.println("Title: " + title);
	            System.out.println("Author: " + author);
	            System.out.println("ISBN: " + isbn);
	        } else {
	            System.out.println("Invalid book instance.");
	        }
	    }

	    public static void main(String[] args) {
	        Book.displayLibraryName();
	        Book book1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
	        Book book2 = new Book("1984", "George Orwell", "ISBN002");
	        System.out.println("\nBook 1 Details:");
	        book1.displayBookDetails();
	        System.out.println("\nBook 2 Details:");
	        book2.displayBookDetails();
	    }
	}



