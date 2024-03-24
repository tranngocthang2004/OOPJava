package Person;

import java.util.Scanner;

public class EmployeePartime extends Employee{
    public float GioLamViec;
    Scanner sc =new Scanner(System.in);
    public void NhapThongTin(){
        super.NhapThongTin();
        do{System.out.print("Gio lam viec: ");
        }while(GioLamViec>0);
        GioLamViec=sc.nextFloat();
    }
    public void TinhLuong(){
        if(GioLamViec>=150){
        Luong = GioLamViec*LuongPart+ ThuongPart;
    }
        Luong=GioLamViec*LuongPart;
    }
}