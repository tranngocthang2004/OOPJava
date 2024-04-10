package Chuong3;

import java.util.Scanner;

public class HinhTruTron extends HinhTron{
    public float ChieuCao;
    public float TheTich;
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        ChieuCao=sc.nextFloat();
    }
    public void tinhTheTich(){
        super.tinhDienTich();
        TheTich= DienTich*ChieuCao;
    }
    @Override public void inThongTin(){
        System.out.println("The Tich = "+TheTich);
    }
}
