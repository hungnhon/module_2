package ss10.bai2;
import java.util.ArrayList;

public class CustomerManager {

    private ArrayList<Customer> customers = new ArrayList<>();


    public void add(Customer customer) {
        customers.add(customer);
        System.out.println(" Đã thêm khách hàng");
    }


    public void display() {
        if (customers.isEmpty()) {
            System.out.println(" Danh sách trống");
            return;
        }

        System.out.println("ID | Name | Type | Address");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public void delete(int id) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                customers.remove(i);
                System.out.println("✅ Đã xóa khách hàng id = " + id);
                return;
            }
        }
        System.out.println(" Không tìm thấy id = " + id);
    }


    public void update(int id, String newName, String newType, String newAddress) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                c.setName(newName);
                c.setType(newType);
                c.setAddress(newAddress);
                System.out.println(" Đã cập nhật khách hàng");
                return;
            }
        }
        System.out.println("Không tìm thấy id = " + id);
    }


    public void searchByName(String keyword) {
        boolean found = false;
        for (Customer c : customers) {
            if (c.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println(" Không tìm thấy khách hàng phù hợp");
        }
    }
}