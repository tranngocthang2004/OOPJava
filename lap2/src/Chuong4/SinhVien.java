import java.util.Scanner;

public class SinhVien {
    public String HoTen;
    public float Diem;
    Scanner sc = new Scanner(System.in);
    public void NhapthongTin(){
        System.out.print("Nhap ho ten: ");
        HoTen=sc.nextLine();
            if(HoTen.isEmpty()){
            return;
        }
        System.out.println("Nhap diem: ");
        Diem = sc.nextInt();
        sc.nextLine();
    }
    public void inThongTin(){
        System.out.println("Ho Ten: "+HoTen);
        System.out.println("Diem: "+Diem);
        
    }
}
