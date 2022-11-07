import java.io.*;
import java.util.*;


public class Arrays_java {
    //    ArrayList is a part of the Java collection framework and it is a class of java.util package.
    //    It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be
    //    helpful in programs where lots of manipulation in the array is needed. This class is found in java.util package.
    //    The main advantages of ArrayList are, if we declare an array then it’s needed to mention the size but in ArrayList,
    //    it is not needed to mention the size of ArrayList if you want to mention the size then you can do it.
    //    https://github.com/themanoftalent
    // Java program to demonstrate the
    // working of ArrayList in Java

    public static void main(String[] args) {
        // Size of the ArrayList
        int size = 6;

        // Declaring the ArrayList with initial size n
        ArrayList<Integer> modestas = new ArrayList<Integer>(size); //The size of the ArrayList is 6

        // Appending new elements at the end of the list
        for (int i = 0; i <= size; i++)
            modestas.add(i);


        // Printing elements
        System.out.println("The array list memebers are  " + modestas);

        // Remove element at index 3
        modestas.remove(3);

        // Displaying the ArrayList after deletion
        System.out.println("After removing index 3 element " + modestas);

        // Printing elements one by one
        for (int i = 0; i < modestas.size(); i++)
            System.out.print("\n " + modestas.get(i));
    }
}


