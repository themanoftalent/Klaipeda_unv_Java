public class Address {

    private String name;
    private String line1; // line1 variable
    private String city; // city variable
    private String zip; // zip variable


    public Address(String name, String line1, String city, String zip) {
        super();
        this.name = name;
        this.line1 = line1;
        this.city = city;
        this.zip = zip;

    }

    public String toString() {
        return name + " " + line1 + " " + city + " " + zip;
    }
}