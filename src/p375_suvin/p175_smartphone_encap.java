//175) Create a class representing a smartphone with private member variables (brand, ram, storage) and public methods (getters and setters).

package p375_suvin;

class Smartphone {
    private String brand;
    private int ram;
    private int storage;

    public void setBrand(String b) { brand = b; }
    public String getBrand() { return brand; }
    public void setRam(int r) { ram = r; }
    public int getRam() { return ram; }
    public void setStorage(int s) { storage = s; }
    public int getStorage() { return storage; }
}

public class p175_smartphone_encap {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.setBrand("Google Pixel");
        s.setRam(12);
        s.setStorage(256);
        System.out.println("Brand: " + s.getBrand() + ", RAM: " + s.getRam() + "GB, Storage: " + s.getStorage() + "GB");
    }
}

//output
//Brand: Google Pixel, RAM: 12GB, Storage: 256GB
