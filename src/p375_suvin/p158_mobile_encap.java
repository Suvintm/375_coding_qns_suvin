//158) Create a class representing a mobile phone with private member variables (brand, model, price) and public methods (getters and setters).

package p375_suvin;

class Mobile {
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

public class p158_mobile_encap {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setBrand("Samsung");
        m.setModel("S23");
        m.setPrice(75000);
        System.out.println("Brand: " + m.getBrand() + ", Model: " + m.getModel() + ", Price: " + m.getPrice());
    }
}

//output
//Brand: Samsung, Model: S23, Price: 75000.0
