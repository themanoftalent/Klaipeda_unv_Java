public class Customer_runner {
    public static void main(String[] args) {
        Address homeAddress = new Address("123 Main Street", "New York", "NY", "12345"); //creation of object name
        Address workAddress = new Address("456 Main Street", "New York", "NY", "12345"); //creation of object workAddress
        Customers customers = new Customers("Ranga", homeAddress); // creation of object customers homeAddress
        customers.setWorkAddress(workAddress); // setting workAddress
        System.out.println(customers); // printing customers
    }
}
