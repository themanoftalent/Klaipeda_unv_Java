import java.util.*;
import java.util.Scanner; // this package is used to read input from the user input stream


public class AreaRunner {
    public static void main(String[] args) { //main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth = sc.nextInt();

        AreaContainer objName = new AreaContainer(length, breadth);
        System.out.println("The area of the rectangle is: " + objName.calculateArea());

    }
}
