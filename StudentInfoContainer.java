import java.lang.reflect.Array;

public class StudentInfoContainer {
    //variables instance
    //create array
    private String[] name = new String[4];
    private int[] age = new int[4];
    private String[] id = new String[4];
    private String[] address = new String[4];


    //##################################
    //getters
    public String getName(int i) {
        return name[i];
    }

    public int getAge(int i) {
        return age[i];
    }

    public String getId(int i) {
        return id[i];
    }

    public String getAddress(int i) {
        return address[i];
    }

    //##################################
    //Setters
    public void setName(String name, int i) {
        this.name[i] = name;
    }

    public void setAge(int age, int i) {
        this.age[i] = age;
    }

    public void setId(String id, int i) {
        this.id[i] = id;
    }

    public void setAddress(String address, int i) {
        this.address[i] = address;
    }

}

