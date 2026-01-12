package ss10.bai2;

public class Customer {
    private int id;
    private String name;
    private String type;
    private String address;

    public Customer(int id, String name, String type, String address) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return id + " | " + name + " | " + type + " | " + address;
    }
}