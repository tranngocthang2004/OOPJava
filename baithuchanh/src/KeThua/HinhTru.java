package KeThua;

import java.util.Scanner;

public class HinhTru extends HinhTron{
    public HinhTru(){
        Ten="Hinh Tru ";
    }
    public float ChieuCao;
    Scanner sc = new Scanner(System.in);
    public void NhapChieuCao(){
        NhapBanKinh();
        System.out.print("Chieu cao = ");
        ChieuCao=sc.nextFloat();
    }
    public void TinhTheTich(){
        TinhDienTich();
        TheTich=DienTich*ChieuCao;
    }
    
}
