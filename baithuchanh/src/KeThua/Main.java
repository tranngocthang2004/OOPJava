package KeThua;

public class Main {
    public static void main(String[] args) {
        //Hinh Tron 
        HinhTron hinhTron=new HinhTron();
        hinhTron.XuatTen();
        hinhTron.NhapBanKinh();
        hinhTron.TinhChuVi();
        hinhTron.TinhDienTich();
        hinhTron.InChuVi();
        hinhTron.InDienTich();
        //Hinh Tru
        HinhTru hinhTru=new HinhTru();
        hinhTru.XuatTen();
        hinhTru.NhapChieuCao();
        hinhTru.TinhTheTich();
        hinhTru.InTheTich();
        //Hinh Chu Nhat
        HinhChuNhat hinhChuNhat= new HinhChuNhat();
        hinhChuNhat.XuatTen();
        hinhChuNhat.NhapChieuDai();
        hinhChuNhat.NhapChieuRong();
        hinhChuNhat.TinhDienTich();
        hinhChuNhat.TinhChuVi();
        hinhChuNhat.InChuVi();
        hinhChuNhat.InDienTich();
        //Hinh Vuong
        HinhVuong hinhVuong=new HinhVuong();
        hinhVuong.XuatTen();
        hinhVuong.NhapCanh();
        hinhVuong.TinhChuVi();
        hinhVuong.TinhDienTich();
        hinhVuong.InChuVi();
        hinhChuNhat.InDienTich();
        }
    
}
