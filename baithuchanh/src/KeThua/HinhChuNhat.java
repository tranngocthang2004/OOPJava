package KeThua;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public HinhChuNhat(){
     Ten= "Hinh Chu Nhat ";   
    }
    Scanner sc= new Scanner(System.in);
    public float Dai;
    public float Rong;
    public void NhapChieuRong(){
        System.out.print("Chieu Rong= ");
        Rong=sc.nextFloat();
    }
    public void NhapChieuDai(){
        System.out.print("Chieu Dai= ");
        Dai=sc.nextFloat();
    }
    public void TinhDienTich(){
        DienTich=Dai*Rong;
    }
    public void TinhChuVi(){
        ChuVi=2*(Dai+Rong);
    }
}
