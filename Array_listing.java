import java.io.*;
import java.util.*;

public class Array_listing {
    // Java program to demonstrate the working of ArrayList in Java
    public static void main(String[] args) {
        // Declaring the ArrayList without mentioned its size
        ArrayList<Integer> Krutikovas = new ArrayList<>();

        // Appending new elements at the end of the list
        for (int i = 0; i <= 10; i++)
            Krutikovas.add(i);

        // Printing elements
        System.out.println(Krutikovas);

        // Remove element at index 3
        Krutikovas.remove(0);

        // Displaying the ArrayList after deletion
        System.out.println(Krutikovas);

        // Printing elements one by one
        for (int i = 0; i < Krutikovas.size(); i++) {
            if (Krutikovas.get(i) == 5) {
                System.out.println("Element 5 is present at index " + i);}
            System.out.println(Krutikovas.get(i) + " ");
        }
    }
}




