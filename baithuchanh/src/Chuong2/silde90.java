package Chuong2;
import java.util.Scanner;

public class silde90 {
    public static void main(String[] args) {
        String ten =new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten ");
        ten=sc.nextLine();
        for(int i=0;i< ten.length();i++)
        System.out.println(ten.charAt(i));
    }
}
