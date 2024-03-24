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
        super.NhapThongTin();
        System.out.print("MaNhanVien: ");
        MaNhanVien=sc.nextLine();
    }
    public void InThongTin(){
        super.InThongTin();
        System.out.println("Ma nhan vien: "+MaNhanVien);
        System.out.println("Luong= "+Luong);
    }
}
