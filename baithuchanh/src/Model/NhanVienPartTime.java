package Model;

import Util.Configs;

public class NhanVienPartTime extends NhanVien {
    private int GioLamViec;
    public NhanVienPartTime(String Ten, int GioLamViec){
        this.Ten=Ten;
        this.GioLamViec=GioLamViec;
    }
    @Override public String LoaiNhanVien(){
        return "Nhan vien parttime";
    }
    public void TinhLuong(){
        Luong=Configs.LUONG_NHAN_VIEN_PARTTIME_MOI_GIO*GioLamViec;
    }
}
