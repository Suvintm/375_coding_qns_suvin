//170) Create a class representing a clock with private member variables (hours, minutes, seconds) and public methods (getters and setters).

package p375_suvin;

class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }
    public String getTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

public class p170_clock_encap {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime(10, 30, 45);
        System.out.println("Time: " + c.getTime());
    }
}

//output
//Time: 10:30:45
