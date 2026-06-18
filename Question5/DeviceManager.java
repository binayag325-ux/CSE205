package Question5;

public class DeviceManager {

    public static void main(String[] args) {

        // Create an array of ElectronicDevice type
        ElectronicDevice[] devices = new ElectronicDevice[2];

        // Store different device objects
        devices[0] = new Printer();
        devices[1] = new Scanner();

        // Loop through devices and call powerOn()
        for (ElectronicDevice device : devices) {

            // Polymorphism: calls respective class method
            device.powerOn();
        }
    }
}
