package Person;

import java.util.Scanner;

public class Person {
    public String HoTen;
    public String SoCCCD;
    public int Tuoi;
    Scanner sc = new Scanner(System.in);
    public void NhapThongTin(){
        System.out.print("Nhap ho ten: ");
        HoTen=sc.nextLine();
        System.out.print("Nhap so CCCD: ");
        SoCCCD=sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Tuoi=sc.nextInt();
    }
    public void InThongTin(){
        System.out.println("========"+HoTen+"========");
        System.out.println("So CCCD: "+SoCCCD);
        System.out.println("Tuoi: "+Tuoi);
    }

}
