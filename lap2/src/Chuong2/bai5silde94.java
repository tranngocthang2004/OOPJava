package Chuong2;
import java.util.Scanner;

public class bai5silde94 {
    public static void main(String[] args) {
        int a, tong =0 ;
        Scanner sc= new Scanner(System.in);
    while(tong <=100 ){
        System.out.println("nhap so nguyen:");
        a=sc.nextInt();
        tong = tong + a;
    }
    System.out.println("tong cac so vua nhap la: "+ tong );
    }
}
