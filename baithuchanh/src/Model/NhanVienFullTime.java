package Model;

import Util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int NgayLamThem;
    private int LoaiChucVu;
    public NhanVienFullTime(String Ten){
        this.Ten = Ten;
    }
    public NhanVienFullTime(String Ten, int NgayLamThem){
        this.Ten = Ten ;
        this.NgayLamThem=NgayLamThem;
    }
    public void setLoaiChucVu(int LoaiChucVu){
        this.LoaiChucVu= LoaiChucVu;
    }
    @Override public String LoaiNhanVien(){
        return" Nhan vien fulltime";
    }
    public void TinhLuong(){
        if(LoaiChucVu==2)
            Luong= NgayLamThem*Configs.LUONG_NHAN_VIEN_FULLTIME_MOI_NGAY + Configs.LUONG_NHAN_VIEN_FULLTIME_LINH;
        else{
            Luong= NgayLamThem*Configs.LUONG_NHAN_VIEN_FULLTIME_MOI_NGAY+Configs.LUONG_NHAN_VIEN_FULLTIME_SEP;
        }
    }
}
