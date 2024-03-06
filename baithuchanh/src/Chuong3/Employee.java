package Chuong3;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Employee {
    public String HoTen;
    public String MaNhanVien;
    public int Ngaysinh;
    public int Thangsinh;
    public int Namsinh;
    public int Tuoi;
    Scanner sc = new Scanner(System.in);
    public void NhapThongTin(){
        System.out.print("nhap ho ten nhan vien: ");
        HoTen= sc.nextLine();
        System.out.print("nhap ma nhan vien: ");  
        MaNhanVien=sc.nextLine(); 
        do{System.out.print("nhap ngay sinh: ");
        Ngaysinh=sc.nextInt();
        }while(Ngaysinh>31 || Ngaysinh<0);
        do{System.out.print("nhap thang sinh: ");
        Thangsinh=sc.nextInt();
        }while (Thangsinh>12||Thangsinh<0);
        do{System.out.print("nhap nam sinh: ");
        Namsinh=sc.nextInt();
        }while(Namsinh>LocalDate.now().getYear());
        LocalDate tuoi = LocalDate.of(Namsinh, Thangsinh, Ngaysinh);
        LocalDate Namhientai= LocalDate.now(); 
        Tuoi = Period.between(tuoi, Namhientai).getYears();
    } 
    public void InThongTin(){
        System.out.print("\nten nhan vien: "+HoTen);
        System.out.print("\nma nhan vien: "+MaNhanVien);
        System.out.print("\ntuoi: "+ Tuoi);
    }
}

