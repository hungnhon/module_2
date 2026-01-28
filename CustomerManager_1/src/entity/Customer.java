package entity;

public class Customer extends Person {
    private String address;

    public Customer(int id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String getInfoToCSV() {
        return getId() + "," + getName() + "," + address;
    }


    public static Customer fromCSV(String line) {
        String[] arr = line.split(",");
        return new Customer(
                Integer.parseInt(arr[0]),
                arr[1],
                arr[2]
        );
    }

    @Override
    public String toString() {
        return super.toString() + ", địa chỉ='" + address + "'";
    }
}
