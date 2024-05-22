import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class bai5silde115 {
    public static void main(String[] args) {
        Map<String,SinhVien1> danhsachsinhvien = new HashMap<>();
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong sinh vien ban muon nhap vao danh sach: ");
        size=sc.nextInt();
        for(int i=0;i<size;i++){
            SinhVien1 sinhVien1 = new SinhVien1();
            sinhVien1.NhapthongTin();
            danhsachsinhvien.put(sinhVien1.MSV, sinhVien1);
        }
        sc.nextLine();
        String lop;
        boolean timthay=false;
        System.out.print("Nhap lop can tim: ");
        lop=sc.nextLine();
       for(SinhVien1 sv : danhsachsinhvien.values()){
            if(sv.Lop.equals(lop)){
                sv.inThongTin();
                timthay=true;
            }
       }
       if(!timthay){
        System.out.println("lop nay khonng co sinh vien");
       }
       String msv;
       System.out.print("Nhap ma sinh vien cua sinh vien can tim: ");
       msv=sc.nextLine();
       System.out.println("thong tin sinh vien can tim la: ");
       SinhVien1 sv = danhsachsinhvien.get(msv);
       if(sv!=null){
       System.out.println("Ho ten: "+sv.HoTen);
       System.out.println("Lop: "+sv.Lop);
       }
       else{
        System.out.println("khong co sinh vien nay trong danh sach");
       }
    }
}
