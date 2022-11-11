//Getter/setters
public class GettersSetters_runner {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(30);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}


// private when you enter a value, it will be stored in the variable
// protected when you enter a value, it will be stored in the variable

// Encapsulation --> when you have to use getter and setter to access the variable in the class.
// Inheritance --> when you have to use extends to access the variable in the class.
// Polymorphism --> when you have to use implements to access the variable in the class.
// Abstraction --> when you have to use abstract to access the variable in the class.