package Chuong3;
import java.util.Scanner;

public class Person {
   public String HoTen;
   public String SoCCCD;
   public int NamSinh;
   Scanner sc = new Scanner(System.in);
   public void NhapThongTin(){
        System.out.print("Nhap ho ten: ");
        HoTen=sc.nextLine();
        System.out.print("Nhap SoCCCD: ");
        SoCCCD= sc.nextLine();
        System.out.print("Nhap nam sinh:");
        NamSinh=sc.nextInt();
   } 
   public void NhapThongTin(String name,String ID,int year){
        System.out.print("Ho ten: "+name);
        System.out.print("\nSo CCCD: "+ID);
        System.out.print("\nTuoi"+(2024-year));
   }
   public void InThongTin(){
        System.out.println("\nHo ten: "+HoTen);
        System.out.print("\nSo CCCD: "+SoCCCD);
        System.out.print("\nTuoi"+(2024-NamSinh));
   }
}
