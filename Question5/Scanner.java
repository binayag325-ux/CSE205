package Question5;

// Scanner class inherits ElectronicDevice
public class Scanner extends ElectronicDevice {

    // Override powerOn method
    @Override
    public void powerOn() {
        System.out.println("Scanner is powering on.");
    }
}