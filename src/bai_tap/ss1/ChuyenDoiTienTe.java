package bai_tap.ss1;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ung dụng chuyển đổi tiền tệ");
        System.out.println("chuyển đổi USD qua VND");
        System.out.println("chuyển đổi VND qua USD");
        System.out.println("lựa chọn chức năng 1 hoặc 2");
int luachon = scanner.nextInt();
switch (luachon) {

    case 1:
        System.out.println("nhập số tiền USD");
double USD = scanner.nextDouble();
double VND = USD*rate;
        System.out.println("số tiền VND tương ứng" + VND );
        break;
    case 2:
        System.out.println("nhập số tiền VND");
        double VNDinput = scanner.nextDouble();
double USDinput = VNDinput/rate;
        System.out.println("số tiền USD tương úng là" + USDinput);
break;
    default:
        System.out.println("không có lựa chọn hợp lệ");
}
    }
}
