package bai_tap.ss1;
import java.util.Scanner;
public class DocSoThanhChu {

    //đoc số từ (0-9)
    public static String docdonvi(int n) {
        switch (n) {
            case 0:
                return "không";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "";}
        }
        public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
            System.out.println("nhập số từ (0-99)");
            int n=scanner.nextInt();
            if(n<0||n>99){
                System.out.println("ngoài phạm vi");
                return ;
            }
            if(n<10){
                System.out.println(docdonvi(n));
            }
            else if(n<20){
                if (n==10){
                    System.out.println("muười");
                }
                else{
                    System.out.println("mười" + docdonvi(n%10));
                }
            }
            else{
//                đọc từ 20-99
                int chuc = n/10;
                int dv = n%10;
                if (dv==0){
                    System.out.println(docdonvi(chuc) + "mươi");
                }
                else{
                    System.out.println(docdonvi(chuc) + "mươi" + docdonvi(dv));
                }
            }


    }
}