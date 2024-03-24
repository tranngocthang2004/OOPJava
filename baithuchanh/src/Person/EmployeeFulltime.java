package Person;

import java.util.Scanner;

public class EmployeeFulltime extends Employee{
    public int NgayLamViec;
    public final float TienXang=200000f;
    public final float TienAn=1500000f;
    Scanner sc = new Scanner(System.in);
    public void NhapThongTin(){
        super.NhapThongTin();
        do{System.out.print("Nhap so ngay lam viec: ");}
        while (NgayLamViec>31|| NgayLamViec<0);
        NgayLamViec=sc.nextInt();
    }
    public void TinhLuong(){
        if(NgayLamViec>=25){
            Luong=LuongFull+ThuongFull+TienAn+TienXang;
        }
        Luong=LuongFull+TienAn+TienXang;
    }
}
