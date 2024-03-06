package Chuong3;
import java.util.Scanner;

public class HinhTron {
    public float banKinh;
    public final float PI = 3.14f;
    public float ChuVi;
    public float DienTich;
    
    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh : ");
        banKinh=sc.nextFloat();
        //sc.close();
    }
    public void tinhChuVi(){
        ChuVi= 2*banKinh*PI;
    }
    public void tinhDienTich(){
        DienTich=banKinh*banKinh*PI;
    }
    public void inThongTin(){
        System.out.println("Chu vi ="+ChuVi+"\nDien tich ="+DienTich+"");
    }
}
