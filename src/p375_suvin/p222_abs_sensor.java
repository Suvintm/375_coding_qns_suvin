//222) Write an abstract class "Sensor" with abstract methods "readData". Implement it in subclasses "TempSensor" and "LightSensor".

package p375_suvin;

abstract class Sensor {
    abstract void readData();
}

class TempSensor extends Sensor {
    void readData() { System.out.println("Reading temperature: 25C"); }
}

public class p222_abs_sensor {
    public static void main(String[] args) {
        Sensor s = new TempSensor();
        s.readData();
    }
}

//output
//Reading temperature: 25C
