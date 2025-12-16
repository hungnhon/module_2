package bai_tap.ss3.mangvaham;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử mảng 1");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("nhập số phần tử mảng 2");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("nhập giá trị cho phần tử");
        for(int i=0;i<arr1.length;i++){
            System.out.println("arr1[" + i + "]");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("nhập giá tri mang 2");
        for(int i =0;i< arr2.length;i++){
            System.out.println("arr2[" + i + "]");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i] = arr2[i];
        }
        System.out.println("mảng sau khi gộp lại");
        for (int x:arr3){
            System.out.print(x + " ");
        }
    }
}
