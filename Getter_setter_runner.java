public class Getter_setter_runner {
    // Main driver method
    public static void main(String[] args) { // public = access from anywhere this is the main method
        // Creating an object of class 1 in main() method
        GetterSetters obj = new GetterSetters(); // GetSet is the name of the class
        // Setting the name by calling setter method
        obj.setName("Domantas"); // setName is the name of the method
        // Getting the name by calling geter method
        System.out.println(obj.getName());
    }
}

