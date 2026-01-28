package service;

import entity.Customer;
import repository.CustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {

    private final CustomerRepository repository =
            new CustomerRepository();

    @Override
    public void themKhachHang(Customer customer) {
        List<Customer> list = repository.findAll();
        list.add(customer);
        repository.saveAll(list);
    }

    @Override
    public List<Customer> layDanhSach() {
        return repository.findAll();
    }
}
