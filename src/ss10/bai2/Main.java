package ss10.bai2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerManager manager = new CustomerManager();

        while (true) {
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm khách hàng");
            System.out.println("3. Xóa khách hàng");
            System.out.println("4. Cập nhật khách hàng");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manager.display();
                    break;

                case 2:
                    System.out.print("Id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("Tên: ");
                    String name = sc.nextLine();
                    System.out.print("Loại khách: ");
                    String type = sc.nextLine();
                    System.out.print("Địa chỉ: ");
                    String address = sc.nextLine();

                    manager.add(new Customer(id, name, type, address));
                    break;

                case 3:
                    System.out.print("Nhập id cần xóa: ");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    manager.delete(deleteId);
                    break;

                case 4:
                    System.out.print("Id cần cập nhật: ");
                    int updateId = Integer.parseInt(sc.nextLine());
                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Loại mới: ");
                    String newType = sc.nextLine();
                    System.out.print("Địa chỉ mới: ");
                    String newAddress = sc.nextLine();

                    manager.update(updateId, newName, newType, newAddress);
                    break;

                case 5:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình");
                    return;

                default:
                    System.out.println(" Lựa chọn không hợp lệ");
            }
        }
    }
}
