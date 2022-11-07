package lt.kvk.nextlesson;

//Java program to illustrate the
//concept of inheritance
//base class
public class Bicycle2 extends Bicycle{
    public static void main(String args[])
     {

         MountainBike mb = new MountainBike(3, 100, 25);
         System.out.println(mb.toString());
     }
// the Bicycle class has two fields
public int gear;
public int speed;

 // the Bicycle class has one constructor
public Bicycle2(int gear, int speed)
{
     super(gear, speed);
     this.gear = gear;
     this.speed = speed;
}
// toString() method to print info of Bicycle
public String toString()
{
     return ("No of gears are " + gear + "\n"
             + "speed of bicycle is " + speed);
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

}

//derived class
class MountainBike extends Bicycle {

 // the MountainBike subclass adds one more field
public int seatHeight;

 // the MountainBike subclass has one constructor
public MountainBike(int gear, int speed,
                     int startHeight) {
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
             + seatHeight + "\n speed is " + this.speed + "\n gear is " + this.gear);
}
@Override
public void applyBrake(int decrement) {
     super.applyBrake(decrement);
}
@Override
public void speedUp(int increment) {
     super.speedUp(increment);
}
}
