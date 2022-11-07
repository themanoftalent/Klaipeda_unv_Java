public class Fan_runner { // public class Fan_runner
    public static void main(String[] args) { // main method with String array args
        Fan fan = new Fan("Manufacturer 1", 0.3456, "GREEN");
        // Fan object fan with make, radius, color parameters
        fan.switchOn(); // fan object switchOn method
        System.out.println(fan); // print fan object
        fan.setSpeed((byte) 9); // fan object setSpeed method with byte 3
        System.out.println(fan); // print fan object
        fan.switchOff(); // fan object switchOff method
        System.out.println(fan); // print fan object
    }
}
