import java.util.Scanner;

public class SinhVien1 {
    String HoTen;
    String MSV;
    String Lop;
    Scanner sc = new Scanner(System.in);
    public void NhapthongTin(){
        System.out.print("ho ten: ");
        HoTen=sc.nextLine();
        System.out.print("Nhap msv: ");
        MSV=sc.nextLine();
        System.out.print("Lop: ");
        Lop=sc.nextLine();
        }
    public void  inThongTin(){
        System.out.println("Ho ten: "+HoTen);
        System.out.println("Lop: "+Lop);
        System.out.println("Ma Sv: "+MSV);
    }
}