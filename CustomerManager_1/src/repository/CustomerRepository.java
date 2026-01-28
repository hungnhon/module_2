package repository;

import entity.Customer;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    private static final String PATH = "data/customer.csv";

    @Override
    public List<Customer> findAll() {
        List<String> lines = ReadAndWriteFile.readFromCSV(PATH);
        List<Customer> customers = new ArrayList<>();


        if (lines.size() <= 1) {
            return customers;
        }


        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.trim().isEmpty()) continue;
            customers.add(Customer.fromCSV(line));
        }
        return customers;
    }

    @Override
    public void saveAll(List<Customer> customers) {
        List<String> lines = new ArrayList<>();

        lines.add("id,name,address");

        for (Customer c : customers) {
            lines.add(c.getInfoToCSV());
        }


        ReadAndWriteFile.writeToCSV(PATH, lines, false);
    }
}
