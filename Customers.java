public class Customers {

    //state
    private String name; // name of customer the variable is private, so it can only be accessed by the class
    private Address homeAddress; //so it can only be accessed by the class
    private Address workAddress;// so it can only be accessed by the class
    //creating customer constructor, they are initialized with the name and homeAddress
    public Customers(String name, Address homeAddress) { // constructor for customer name and homeAddress
        this.name = name;
        this.homeAddress = homeAddress;
    }
    //operations
    public Address getHomeAddress() {
        return homeAddress;
    } // getter for homeAddress to get the homeAddress
    public void setHomeAddress(Address homeAddress) { // setter for homeAddress to set the homeAddress
        this.homeAddress = homeAddress;
    }
    public Address getWorkAddress() {
        return workAddress;
    } // getter for workAddress to get the workAddress
    public void setWorkAddress(Address workAddress) {// setter for workAddress to set the workAddress
        this.workAddress = workAddress;
    }
    public String toString() { // this is a method that returns a string of the customer name and homeAddress and workAddress if it is set
        return String.format("name - [%s] home address - [%s] work address - [%s])"
                , name, homeAddress, workAddress);
    }

}
