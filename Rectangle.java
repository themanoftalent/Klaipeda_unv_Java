public class Rectangle {
    // state (fields) - length, width (int)
    protected int length; // protected - allows access to the field from the same package
    protected int width; // protected - allows access to the field from the same package

    // creation (constructor) - length, width (int)
    public Rectangle(int length, int width) { // public - accessible from anywhere
        this.length = length; // this - refers to the current object
        this.width = width; // this - refers to the current object
    }
    // operations (methods) - getLength(), setLength(int), getWidth(), setWidth(int), area(), perimeter(), toString()
    public int getLength() { // getter gets the value of a field return the value
        return length;     }
    public void setLength(int length) { // void - no return value
        this.length = length;     }

    public int getWidth() {         return width;     }

    public void setWidth(int width) {         this.width = width;     }
    public int area() {         return length * width;     }
    public int perimeter() {         return 2 * (length + width);     }

    public String toString() {
        return String.format("The length : %d and width : %d. The area is %d. Finally the perimeter is %d",
                length, width, area(), perimeter());     } }
//    Getter and setters
//    Getter and Setter are methods used to protect your data and make your code more secure. Getter returns the value (accessors), it returns the value of data type int, String, double, float, etc.
//    For the program’s convenience, getter starts with the word “get” followed by the variable name.
//    While Setter sets or updates the value (mutators). It sets the value for any variable used in a class’s programs. and starts with the word “set” followed by the variable name.
//    Getter and Setter make the programmer convenient in setting and getting the value for a particular data type. In both getter and setter, the first letter of the variable should be capital.