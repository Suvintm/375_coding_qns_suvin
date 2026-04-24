//161) Create a class representing a library book with private member variables (title, author, price) and public methods (getters and setters).

package p375_suvin;

class LibBook {
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

public class p161_library_book_encap {
    public static void main(String[] args) {
        LibBook lb = new LibBook();
        lb.setTitle("Clean Code");
        lb.setAuthor("Robert Martin");
        lb.setPrice(1200);
        System.out.println("Book: " + lb.getTitle() + " by " + lb.getAuthor() + ", Price: " + lb.getPrice());
    }
}

//output
//Book: Clean Code by Robert Martin, Price: 1200.0
