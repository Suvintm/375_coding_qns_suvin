//165) Create a class representing a product with private member variables (id, name, price) and public methods (getters and setters).

package p375_suvin;

class Product {
    private int id;
    private String name;
    private double price;

    public void setId(int i) { id = i; }
    public int getId() { return id; }
    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setPrice(double p) { price = p; }
    public double getPrice() { return price; }
}

public class p165_product_encap {
    public static void main(String[] args) {
        Product p = new Product();
        p.setId(101);
        p.setName("Laptop");
        p.setPrice(55000);
        System.out.println("Product: " + p.getName() + " (ID: " + p.getId() + "), Price: " + p.getPrice());
    }
}

//output
//Product: Laptop (ID: 101), Price: 55000.0
