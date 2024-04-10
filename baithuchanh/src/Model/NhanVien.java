package Model;
public class NhanVien {
    protected String Ten;
    protected long Luong;
    public void NhanVien(){

    };
    public void NhanVien(String Ten){
        this.Ten = Ten;
    };
    protected String LoaiNhanVien(){
        return "";
    }
    public void XuatThongTin(){
        System.out.println("Nhan vien ten: "+ Ten);
        System.out.println("Loai nhan vien: "+ LoaiNhanVien());
        System.out.println("Luong: "+Luong);
    }
}
