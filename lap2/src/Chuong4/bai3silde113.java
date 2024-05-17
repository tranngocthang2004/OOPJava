import java.util.LinkedList;
import java.util.Scanner;
public class bai3silde113 {
    public static void main(String[] args) {
        LinkedList<SinhVien> linkedListSinhVien = new LinkedList<>();
        while (true) {  
            SinhVien sv = new SinhVien();      
            sv.NhapthongTin();
            if(sv.HoTen.isEmpty()){
                System.out.println("da dung nhap thong tin");
                break;
            }else{
                linkedListSinhVien.add(sv);
            }
        }
        //Tim sinh vien thi lai
        int SoNguoiThiLai = 0;
        System.out.println("\nnhung sinh vien thi lai la :");
        for (SinhVien Sv : linkedListSinhVien) {
            if (Sv.Diem <= 5) {
                SoNguoiThiLai++;
                Sv.inThongTin();
            }
        }
        System.out.println("so luong sinh vien thi lai: " + SoNguoiThiLai);
        //Tim sinh vien co diem cao
        float max=0;
        for(SinhVien Sv: linkedListSinhVien){
            if(max< Sv.Diem){
                max=Sv.Diem;
            }
        }
        System.out.println("nhung hoc sinh co diem cao nhat la : ");
        for(SinhVien Sv:linkedListSinhVien){
            if(Sv.Diem == max){
                Sv.inThongTin();
            }
        }
        // tim thong tin sinh vien theo ten 
        String Hoten;
        boolean TimThay = false;
        System.out.print("Nhap ho ten sinh vien can tim: ");{
            Scanner sc = new Scanner(System.in);
            Hoten= sc.nextLine();
        }
        
        for(SinhVien Sv: linkedListSinhVien){
            if(Sv.HoTen.equals(Hoten)){
                System.out.println("thong tin sinh vien can tim la " );
                Sv.inThongTin();
                TimThay = true;
            }
        }
        if(TimThay==false){
            System.out.println("khong tim thay sinh vien trong danh sach");
        }
        }
    }
    

