package JAVAOOP;

import java.util.ArrayList;

class Publication {
    protected String publisher;
    protected int numberOfPages;
    protected double price;
    protected String title;

    public Publication(String publisher, int numberOfPages, double price, String title) {
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.title = title;
    }

    public void print() {
        System.out.println("The " + (publisher != null ? publisher : "null") + " publishes " + (title != null ? title : "null") + ", " + numberOfPages + " pages, " + price + " Bahts.");
    }
}

class Magazine extends Publication {
    private String publicationUnit;

    public Magazine(String publisher, int numberOfPages, double price, String title, String publicationUnit) {
        super(publisher, numberOfPages, price, title);
        this.publicationUnit = publicationUnit;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This megazine is " + (publicationUnit != null ? publicationUnit : "null") + " print.");
    }
}

class Book extends Publication {
    private String author;

    public Book(String publisher, int numberOfPages, double price, String title, String author) {
        super(publisher, numberOfPages, price, title);
        this.author = author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This book has written by " + (author != null ? author : "null") + ".");
    }
}

class KidsMagazine extends Publication{
    private int ageRange;

    public KidsMagazine(String publisher, int numberOfPages, double price, String title,int ageRange){
        super(publisher, numberOfPages, price, title);
        this.ageRange = ageRange;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This KidsMagazine's recommand age range is: "+ ageRange);
    }
}

public class TestPublication {
    public static void main(String[] args) {
        ArrayList<Publication> publications = new ArrayList<>();

        publications.add(new Magazine("Marvel Comic", 30, 3.0, "Spiderman", "monthly"));
        publications.add(new Magazine(null, 0, 0.0, null, null));
        publications.add(new Magazine("DC Comic", 30, 3.0, "Aquaman", "weekly"));
        publications.add(new Book(null, 0, 0.0, null, null));
        publications.add(new Book(null, 0, 0.0, null, "J.R.R Tolkein"));

        for (Publication pub : publications) {
            pub.print();
            System.out.println();
        }
    }
}
