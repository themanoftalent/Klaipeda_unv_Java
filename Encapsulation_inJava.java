public class Encapsulation_inJava {
    //    Encapsulation
//    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
//    To achieve this, you must:
//    declare class variables/attributes as private
//    provide public get and set methods to access and update the value of a private variable
    private String name; // private = restricted access
    private int age; // private = restricted access

    public static void main(String[] args) {
        Encapsulation_inJava myObj = new Encapsulation_inJava(); // Create an object of the class
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }

    // Getter
    public String getName() {return name; }

    // Setter
    public void setName(String newName) { this.name = newName;
    }
}