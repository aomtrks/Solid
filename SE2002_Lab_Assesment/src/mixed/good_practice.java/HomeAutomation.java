interface Switchable {
    void turnOn();
}
interface TemperatureAdjustable extends  Switchable {
    void adjustTemperature(int t);
}

public class HomeAutomation {
    public void manage(TemperatureAdjustable d, String action) {
            d.turnOn();
            d.adjustTemperature(24);
    }
}

class AirConditioner implements TemperatureAdjustable {
    public void turnOn() { System.out.println("AC On"); }
    public void adjustTemperature(int t) { System.out.println("Temp set to " + t); }
}

class Light implements Switchable {
    public void turnOn() { System.out.println("Light On"); }
}