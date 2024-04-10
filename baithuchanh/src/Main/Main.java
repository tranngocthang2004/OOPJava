package Main;
import Model.NhanVien;
import Model.NhanVienFullTime;
import Model.NhanVienPartTime;
import Util.Configs;
public class Main {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van Linh");
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Le Van Linh",2);
        // nhan vien parttime 
        NhanVienPartTime ThoiVu= new NhanVienPartTime("Nguyen Van Thoi Vu" , 240);
        // tinh luong 
        sep.TinhLuong();
        linh1.TinhLuong();
        linh2.TinhLuong();
        ThoiVu.TinhLuong();
        // xuat thong tinh 
        sep.XuatThongTin();
        linh1.XuatThongTin();
        linh2.XuatThongTin();
        ThoiVu.XuatThongTin();
    }
   
    
}
