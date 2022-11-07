import java.lang.Math;
public class Numbers {
    public static void main(String[] args) {
        double number= 4.25;
        number = Math.pow(number, 8.0);

        System.out.printf("%1f",number);
        System.out.println();
        System.out.printf("%2f",number);
        System.out.println("\n"+number);
    }
}