//153) Create a class representing a car with private member variables (model, color, price) and public methods (getters and setters).

package p375_suvin;

class Car {
    private String model;
    private String color;
    private double price;

    public void setModel(String m) { model = m; }
    public String getModel() { return model; }
    public void setColor(String c) { color = c; }
    public String getColor() { return color; }
    public void setPrice(double p) { price = p; }
    public double getPrice() { return price; }
}

public class p153_car_encap {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Tesla M3");
        c.setColor("Red");
        c.setPrice(35000);
        System.out.println("Model: " + c.getModel() + ", Color: " + c.getColor() + ", Price: " + c.getPrice());
    }
}

//output
//Model: Tesla M3, Color: Red, Price: 35000.0
