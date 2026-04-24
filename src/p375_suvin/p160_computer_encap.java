//160) Create a class representing a computer with private member variables (brand, model, price) and public methods (getters and setters).

package p375_suvin;

class Computer {
    private String brand;
    private String model;
    private double price;

    public void setBrand(String b) { brand = b; }
    public String getBrand() { return brand; }
    public void setModel(String m) { model = m; }
    public String getModel() { return model; }
    public void setPrice(double p) { price = p; }
    public double getPrice() { return price; }
}

public class p160_computer_encap {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.setBrand("Apple");
        c.setModel("MacBook Air");
        c.setPrice(90000);
        System.out.println("Computer: " + c.getBrand() + " " + c.getModel() + ", Price: " + c.getPrice());
    }
}

//output
//Computer: Apple MacBook Air, Price: 90000.0
