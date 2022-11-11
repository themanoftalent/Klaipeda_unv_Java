public class AreaContainer { //class AreaContainer with two instance variables
    // fields to be calculated by the constructor
    private int length;
    private int breadth;

    //constructor to initialize the fields of the class
    AreaContainer(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //method to calculate the area of the rectangle
    int calculateArea() { //return the value of the area
        return length * breadth;
    }


}
