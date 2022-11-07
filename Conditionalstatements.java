import java.util.*;

public class Conditionalstatements{
    public static void main(String[] args) {
        Scanner readers = new Scanner(System.in);
        System.out.println("Enter input now ");
        int input = readers.nextInt();

        if(input> 10 ) {
            System.out.println("Greater than 10");
        }
        else {
            System.out.println("Less than 10");
        }
    }
}