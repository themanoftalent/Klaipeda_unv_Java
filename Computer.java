public class Computer {
    Computer() {
        System.out.println("Constructor of computer class");
    }

    void computer_method() {
        System.out.println("computer Shutdown");
    }

    public static void main(String[] args) {
        Computers my = new Computers();
        Laptop your = new Laptop();

        my.computer_method();
        your.laptop_method();
    }
}
