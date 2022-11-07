class Computers {
    Computers() {
        System.out.println("Constructor of Computer class.");
    }

    void computer_method() {
        System.out.println("Power gone! Shut down your PC soon...");
    }

    public static void main(String[] args) {
        Computers my = new Computers();
        Laptop your = new Laptop();

        my.computer_method();
        your.laptop_method();
    }
}
class Laptops {
    Laptops() {
        System.out.println("Constructor of Laptop class.");
    }

    void laptop_method() {
        System.out.println("99% Battery available.");
    }
}