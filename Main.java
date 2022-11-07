//palindrome

import java.util.Scanner; // import Scanner class

public class Main { // class Main starts here
    public static void main(String[] args) { // main method starts here
        System.out.println("Enter a anything : "); // print statement
        Scanner sc = new Scanner(System.in); // create object of Scanner class taking System.in as parameter

        String str = sc.nextLine(); // take input from user and store it in str variable
        int len = str.length(); // store length of str in len variable
        int i = 0; // initialize i with 0
        int j = len - 1; // initialize j with len - 1
        boolean flag = true; // initialize flag with true
        while (i < j) { // while loop starts here
            if (str.charAt(i) != str.charAt(j)) { // if condition starts here
                flag = false; // if condition is true then flag is false
                break; // break the loop
            }
            i++; // increment i
            j--; // decrement j
        }
        if (flag) { // if condition starts here
            System.out.println("Palindrome"); // print statement
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println("Do you want to continue (y/n) : "); // print statement
        char ch = sc.next().charAt(0); // take input from user and store it in ch variable
        if (ch == 'y' || ch == 'Y') { // if condition starts here
            main(args); // call main method
        } else {
            System.out.println("Thank you"); // print statement
        }
    }
}

