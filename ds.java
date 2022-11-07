// concept of inheritance base class
class InheritByclass {
    // the Bicycle class has two fields
    public int gear; // gear of the bicycle public int speed; // speed of the bicycle
    public int speed; // speed of the bicycle public int speed; // speed of the bicycle

    // the Bicycle class has one constructor
    public InheritByclass(int gear, int speed) // constructor of the class
    {
        this.gear = gear; // initialize the gear of the bicycle to the passed value this.gear = gear; // initialize the gear of the bicycle to the passed value
        this.speed = speed; // initialize the speed of the bicycle to the passed value this.speed = speed; // initialize the speed of the bicycle to the passed value
    }
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBikes extends InheritByclass {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBikes(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
    @Override
    public void applyBrake(int decrement) {
        super.applyBrake(decrement-1);
    }
    @Override
    public void speedUp(int increment) {
        super.speedUp(increment+1);
    }

}

// driver
class Test {
    public static void main(String args[])
    {

        MountainBike mb = new MountainBike(13, 105, 15);
        System.out.println(mb.toString());
    }
}
