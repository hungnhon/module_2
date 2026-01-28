package view;

import entity.Customer;
import service.CustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerView {

    private final CustomerService service = new CustomerService();
    private final Scanner sc = new Scanner(System.in);

    public void hienThiMenu() {
        int luaChon = -1;
        do {
            try {
                System.out.println("----- QUẢN LÝ KHÁCH HÀNG -----");
                System.out.println("1. Thêm mới khách hàng");
                System.out.println("2. Hiển thị danh sách khách hàng");
                System.out.println("0. Thoát");
                System.out.print("Chọn chức năng: ");

                luaChon = Integer.parseInt(sc.nextLine());

                switch (luaChon) {
                    case 1:
                        themKhachHang();
                        break;
                    case 2:
                        hienThiDanhSach();
                        break;
                    case 0:
                        System.out.println("Đã thoát.");
                        break;
                    default:
                        System.out.println("Vui lòng nhập 0, 1 hoặc 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Phải nhập SỐ!");
            }
        } while (luaChon != 0);
    }

    private void themKhachHang() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();

        service.themKhachHang(new Customer(id, name, address));
        System.out.println("Thêm khách hàng thành công!");
    }

    private void hienThiDanhSach() {
        List<Customer> list = service.layDanhSach();
        if (list.isEmpty()) {
            System.out.println("Danh sách khách hàng trống.");
        } else {
            for (Customer c : list) {
                System.out.println(c);
            }
        }
    }
}
