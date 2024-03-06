package Chuong2;
import java.util.Scanner;

public class phuongtrinhbac1 {
    
    public static void main(String[] args) {
        double  a,b;
    Scanner sc = new Scanner (System.in);
    System.out.print(" nhap he so a : ");
    a= sc.nextDouble();
    System.out.print(" nhap he so b : ");
    b =sc.nextDouble();
    if(a==0){
        if(b==0){
            System.out.println("phuong trinh vo so nghiem");
        }
        else{
            System.out.println("phuong trinh vo nghiem ");
        }
    }
    else {
        System.out.println("phuong trinh co nghiem: "+ -b/a);
    }
}
}
