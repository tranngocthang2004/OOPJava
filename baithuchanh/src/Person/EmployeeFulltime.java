package Person;

import java.util.Scanner;

public class EmployeeFulltime extends Employee{
    public int NgayLamViec;
    public final float TienXang=200000f;
    public final float TienAn=1500000f;
    Scanner sc = new Scanner(System.in);
    public void NhapNgayLamViec(){
        System.out.print("So ngay lam viec: ");
        NgayLamViec=sc.nextInt();
    }
    public void TinhLuong(){
        if(NgayLamViec>=25){
            Luong=LuongFull+ThuongFull+TienAn+TienXang;
        }
        Luong=LuongFull+TienAn+TienXang;
    }
}
