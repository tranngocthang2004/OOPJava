import java.util.Scanner;

import javafx.geometry.Dimension2D;

public class HinhTron {
    public float banKinh;
    public final float PI = 3.14f;
    public float ChuVi;
    public float DienTich;
    Scanner sc = new Scanner(System.in);
    public void nhapBanKinh(){
        System.out.print("nhap ban kinh : ");
        banKinh=sc.nextFloat();
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
