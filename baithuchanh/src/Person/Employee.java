package Person;

import java.util.Scanner;

public class Employee extends Person {
    public String MaNhanVien;
    public final float LuongFull= 6000000f;
    public final float LuongPart = 20000f;
    public final float ThuongFull=500000f;
    public final float ThuongPart=15000f;
    public float Luong;
    Scanner sc= new Scanner(System.in);
    public void NhapThongTin(){
        System.out.print("Ho va Ten: ");
        HoTen= sc.nextLine();
        System.out.print("So CCCD: ");
        SoCCCD=sc.nextLine();
        System.out.print("Tuoi: ");
        Tuoi=sc.nextInt();
        sc.nextLine();
        System.out.print("MaNhanVien: ");
        MaNhanVien=sc.nextLine();
    }
    public void XuatThongTin(){
        System.out.print("============="+HoTen+"=============");
        System.out.println("\nSoCCD: "+SoCCCD);
        System.out.println("Tuoi: "+Tuoi);
        System.out.println("Luong= "+Luong);
    }
}
