package Chuong2;
import java.util.Scanner;

public class silde47 {
    public static void main(String[] args) {
        int a, tong =0 ;
        Scanner sc= new Scanner(System.in);
    while(tong <=100 ){
        System.out.println("nhap so nguyen:");
        a=sc.nextInt();
        tong = tong + a;
    }
    System.out.println("tong vua nhap la: "+ tong );
    }
}
