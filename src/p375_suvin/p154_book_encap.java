//154) Create a class representing a book with private member variables (title, author, price) and public methods (getters and setters).

package p375_suvin;

class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String t) { title = t; }
    public String getTitle() { return title; }
    public void setAuthor(String a) { author = a; }
    public String getAuthor() { return author; }
    public void setPrice(double p) { price = p; }
    public double getPrice() { return price; }
}

public class p154_book_encap {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Programming");
        b.setAuthor("Suvin");
        b.setPrice(500);
        System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", Price: " + b.getPrice());
    }
}

//output
//Title: Java Programming, Author: Suvin, Price: 500.0
