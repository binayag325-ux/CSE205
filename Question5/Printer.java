package Question5;

// Printer class inherits ElectronicDevice
public class Printer extends ElectronicDevice {

    // Override powerOn method
    @Override
    public void powerOn() {
        System.out.println("Printer is powering on.");
    }
}