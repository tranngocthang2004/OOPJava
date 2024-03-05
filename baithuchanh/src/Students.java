import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Students {
    public String Fullname= new String();
    public String IDstudent= new String();
    public float DiemA;
    public float DiemB;
    public float DiemC;
    public float DiemTB;
    public int Ngaysinh;
    public int Namsinh;
    public int Thangsinh;
    public int Tuoi;
    Scanner sc = new Scanner(System.in);
    public void NhapThongTin(){
        System.out.print("nhap ten sinh vien: ");
        Fullname=sc.nextLine();
        System.out.print("nhap ma sinh vien: ");
        IDstudent=sc.nextLine();
        System.out.print("nhap diem A: ");
        DiemA=sc.nextFloat();
        System.out.print("nhap diem B: ");
        DiemB=sc.nextFloat(); 
        System.out.print("nhap diem C: ");
        DiemC=sc.nextFloat();
        do{System.out.print("nhap ngay sinh: ");
        Ngaysinh=sc.nextInt();
        }while(Ngaysinh>31 || Ngaysinh<0);
        do{System.out.print("nhap thang sinh: ");
        Thangsinh=sc.nextInt();
        }while (Thangsinh>12||Thangsinh<0);
        do{System.out.print("nhap nam sinh: ");
        Namsinh=sc.nextInt();
        }while(Namsinh>LocalDate.now().getYear());
        LocalDate tuoi = LocalDate.of(Namsinh, Thangsinh, Ngaysinh);
        LocalDate Namhientai= LocalDate.now(); 
        Tuoi = Period.between(tuoi, Namhientai).getYears();
    }
    public void TinhdiemTB(){
        DiemTB=(DiemA*6)/10+ (DiemB*3)/10+ DiemC/10;
    }
    public void inThongTinSinhvien(){
        System.out.print("Ho Ten: "+Fullname+"\nMa sinh vien: "+IDstudent+"\nDiem trung binh: "+DiemTB);
        System.out.print("\nTuoi cua sinh vien la: "+Tuoi);
    }
}
