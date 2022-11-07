    class Bicycle {  // Java program to illustrate the concept of inheritance
    // base class
    // the Bicycle class has two fields
    public int gear; // gear of the bicycle public means it can be accessed by any class
    public int speed; // speed of the bicycle public means it can be accessed by any class

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed) { // constructor of the class Bicycle
        this.gear = gear; // this keyword is used to refer to the current object
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement) { // method to decrement the speed
        speed -= decrement; // speed = speed - decrement
    }

    public void speedUp(int increment) {
        speed += increment; // speed = speed + increment
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class the MountainBike subclass adds one more field
class MountainBike extends Bicycle {
    // the MountainBike subclass adds one more field
    public int seatHeight; // seat height of the mountain bike

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight; // this keyword is used to refer to the current object
    }

    // the MountainBike subclass adds one more method // method to set the seat height
    public void setHeight(int newValue) { //
        seatHeight = newValue; //swap the values of the two variables
    }

    // overriding toString() method of Bicycle to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nMountainBike seat height is "
                + seatHeight);
    }
}

