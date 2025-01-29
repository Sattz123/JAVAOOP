package JAVAOOP.lab_07;

import java.util.Random;

//Abstract class LibraryItem
abstract class LibraryItem {
    public abstract String getBarcode();
    public abstract String getTitle();
    public abstract int getLoanPeriod();
    public abstract void checkout(String borrowerName);
}

//Book class
class Book extends LibraryItem {
    private String barcode;
    private String title;
    private static final int LOAN_PERIOD = 21;

    public Book(String title) {
        this.title = title;
        this.barcode = "B" + new Random().nextInt(1000000);
    }

    @Override
    public String getBarcode() { return barcode; }

    @Override
    public String getTitle() { return title; }

    @Override
    public int getLoanPeriod() { return LOAN_PERIOD; }

    @Override
    public void checkout(String borrowerName) {
        System.out.println("Book checked out by " + borrowerName);
    }
}

//Audiobook class
class Audiobook extends LibraryItem {
    private String barcode;
    private String title;
    private static final int LOAN_PERIOD = 14;

    public Audiobook(String title) {
        this.title = title;
        this.barcode = "A" + new Random().nextInt(1000000);
    }

    @Override
    public String getBarcode() { return barcode; }

    @Override
    public String getTitle() { return title; }

    @Override
    public int getLoanPeriod() { return LOAN_PERIOD; }

    @Override
    public void checkout(String borrowerName) {
        System.out.println("Audiobook checked out by " + borrowerName);
    }
}

//DVD class
class DVD extends LibraryItem {
    private String barcode;
    private String title;
    private static final int LOAN_PERIOD = 7;

    public DVD(String title) {
        this.title = title;
        this.barcode = "D" + new Random().nextInt(1000000);
    }

    @Override
    public String getBarcode() { return barcode; }

    @Override
    public String getTitle() { return title; }

    @Override
    public int getLoanPeriod() { return LOAN_PERIOD; }

    @Override
    public void checkout(String borrowerName) {
        System.out.println("DVD checked out by " + borrowerName);
    }
}

//Main class
public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("The Hitchhiker's Guide to the Galaxy");
        items[1] = new Audiobook("Moby Dick");
        items[2] = new DVD("The Shawshank Redemption");

        for (LibraryItem item : items) {
            System.out.println("Barcode: " + item.getBarcode() + ", Title: " + item.getTitle() + ", Loan Period: " + item.getLoanPeriod() + " days");
            item.checkout("John Doe");
        }
    }
}
