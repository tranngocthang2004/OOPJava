package KeThua;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    Scanner sc = new Scanner(System.in);
    public HinhTron(){
        Ten ="Hinh Tron";
    }
    public float BanKinh;
    public void NhapBanKinh(){
        System.out.print("Ban Kinh = ");
        BanKinh=sc.nextFloat();
    }
    public void TinhChuVi(){
        ChuVi = 2*Pi*BanKinh;
    }
    public void TinhDienTich(){
        DienTich = Pi*BanKinh*BanKinh;
    }
}
