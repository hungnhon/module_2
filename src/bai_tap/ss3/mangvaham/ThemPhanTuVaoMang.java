package bai_tap.ss3.mangvaham;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
    static void inmang(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] themphantu(int[] arr, int x, int index) {
        int n = arr.length;
     if(index<0||index > n){
         System.out.println("vị trí ko hợp lệ");
         return arr ;
     }
     int[]newArr = new int[n+1];
     for(int i=0;i<newArr.length;i++) {
         if (i < index) {
             newArr[i] = arr[i];
         } else if (i == index) {
             newArr[i] = x;
         } else {
             newArr[i] = arr[i - 1];
         }
     }
         return newArr ;
    }

     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr ={2,5,8,12,23,4};
         System.out.println("mảng ban đầu");
         inmang(arr);
         System.out.println("nhập giá trị cần thêm");
         int x = scanner.nextInt();
         System.out.println("nập giá trị cần thêm");
         int index = scanner.nextInt();
         arr= themphantu(arr,x,index);
         System.out.println("mảng sau khi thêm");
         inmang(arr);
    }
}
