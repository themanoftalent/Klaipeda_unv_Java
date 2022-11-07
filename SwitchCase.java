import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter some numbers :");
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();

        switch (x){

            case 1: case 5: case 7:
                System.out.println( "Red");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Black");
                break;
            default:
                System.out.println("White");

        }
    }
}
