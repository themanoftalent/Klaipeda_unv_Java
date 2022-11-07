import java.io.*;

public class GetterSetters {
    // Java Program to Illustrate Getter and Setter
    // Methods in Java

    // Member variable of this class
    private String name; // private variable name
    private String surname; // private = restricted access

    // Method 1 - Getter method to get the value of name
    public String getName() { // public = access from anywhere
        return name; // return value of name to caller
    }

    // Method 2 - Setter method to set the value of name akif, then it changes the value of name to Mantas
    public void setName(String N) { // public = access from anywhere, void means no return value
        this.name = N;  // This keyword refers to current instance itself
    }
}

//The second class but no public class in this file so it is not a main class
// and it is not a driver class so it is not a runner class if public word is used then there happens problems with the main class

//class Gettersetterrunner {
//    // Main driver method
//    public static void main(String[] args) { // public = access from anywhere this is the main method
//        // Creating an object of class 1 in main() method
//        GetterSetters obj = new GetterSetters(); // GetSet is the name of the class
//        // Setting the name by calling setter method
//        obj.setName("Domantas"); // setName is the name of the method
//        // Getting the name by calling geter method
//        System.out.println(obj.getName());
//    }
//}
//



