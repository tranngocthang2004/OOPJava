package Chuong3;
import java.util.Scanner;

public class HinhChuNhat {
    public float dai;
    public float rong;
    public float chuvi;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai = ");
        dai = sc.nextFloat();
        System.out.println("chieu rong  = ");
        rong = sc.nextFloat();
        //sc.close();
    }
    public void InThongTin()
    {
        System.out.println("Dai = " + dai);
        System.out.println("Rong = " + rong); 
    }
}
