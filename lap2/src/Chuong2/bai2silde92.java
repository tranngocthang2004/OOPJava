package Chuong2;
import java.util.Scanner;

public class bai2silde92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        System.out.print("nhap so bat ky: ");
        n= sc.nextInt();
        if(n%2==0)
        System.out.print("so vua nhap la so chan ");
        else
        System.out.print("so vua nhap la so le ");
    }
}
