package Chuong2;
import java.util.Scanner;

public class silde74 {
    public static void main(String[] args) {
        int size;
        int tong=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang: ");
        size =sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("nhap phan tu thu "+(i+1)+" cua mang: ");
            a[i] = sc.nextInt();
            if( a[i]%2==0){
                tong +=a[i];
            }
           }
           System.out.print("tong cac so chan trong mang la: "+ tong );
    }
}
