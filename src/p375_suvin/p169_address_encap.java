//169) Create a class representing an address with private member variables (city, state, zipCode) and public methods (getters and setters).

package p375_suvin;

class Address {
    private String city;
    private String state;
    private String zipCode;

    public void setCity(String c) { city = c; }
    public String getCity() { return city; }
    public void setState(String s) { state = s; }
    public String getState() { return state; }
    public void setZipCode(String z) { zipCode = z; }
    public String getZipCode() { return zipCode; }
}

public class p169_address_encap {
    public static void main(String[] args) {
        Address a = new Address();
        a.setCity("Bangalore");
        a.setState("Karnataka");
        a.setZipCode("560001");
        System.out.println("Address: " + a.getCity() + ", " + a.getState() + " - " + a.getZipCode());
    }
}

//output
//Address: Bangalore, Karnataka - 560001
