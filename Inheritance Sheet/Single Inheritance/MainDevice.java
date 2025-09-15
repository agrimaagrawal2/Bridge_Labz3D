package SingleInheritance;
public class MainDevice {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH123", "On", 24);
        t1.displayStatus();
    }
}
