package service;

import entity.Customer;
import java.util.List;

public interface ICustomerService {
    void themKhachHang(Customer customer);
    List<Customer> layDanhSach();
}
