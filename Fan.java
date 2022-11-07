public class Fan {
    //state variables - attributes - fields - properties
    public String make; // private so it can only be accessed by the class
    public double radius; // private so it can only be accessed by the class
    public String color; // private so it can only be accessed by the class
    public boolean isOn; // private so it can only be accessed by the class boolean is a primitive data type
    public byte speed; //0 to 5 byte is a primitive data type

    //creation of constructor for fan make, radius, color, isOn, speed
    public Fan(String make, double radius, String color) { // constructor for fan make, radius, color
        this.make = make; // this is a reference to the current object
        this.radius = radius; // this is a reference to the current object
        this.color = color; // this is a reference to the current object
    }

    public void switchOn() {
        this.isOn = true;
        setSpeed((byte) 15);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public String toString() {
        return String.format("make - %s, radius - %.3f , color - %s , isOn - %b , speed - %d",
                make, radius, color, isOn, speed);
    }
}
