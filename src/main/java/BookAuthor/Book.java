package BookAuthor;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors = new Author[2];
    private double price;
    private int qty = 0;


    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, 0);
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

//    public String getAuthorName() {
//        return authors.getName();  // cannot use author.name as name is private in Author class
//    }
//
//    public String getAuthorEmail() {
//        return authors.getEmail();  // cannot use author.name as name is private in Author class
//    }
//
//    public char getAuthorGender() {
//        return authors.getGender();  // cannot use author.name as name is private in Author class
//    }
//
}