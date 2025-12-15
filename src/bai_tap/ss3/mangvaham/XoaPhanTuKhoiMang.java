package bai_tap.ss3.mangvaham;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    static void inmang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int xoaphantu(int[] arr, int n, int x) {
        int deleteindex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                deleteindex = i;

                break;
            }
        }
        if (deleteindex != -1) {
            for (int i = deleteindex; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        } else {
            System.out.println("khong tim thay phan tử cần xóa");
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,3,6,8,9,2};
        int n= arr.length;
        System.out.println("mảng ban đầu");
        inmang(arr,n);
        int x = scanner.nextInt();
        n = xoaphantu(arr,n,x);
        System.out.println("mảng sau khi xóa");
        inmang(arr,n);

        //jjjjj
    }

}
