import Chuong3.HinhTruTron;
import Chuong3.HinhChuNhat;
import Chuong3.HinhTron;
import Chuong3.Person;


public class App {
        public static void main(String[] args) throws Exception {
            HinhTron ht = new HinhTron();
            ht.nhapBanKinh();
            ht.tinhDienTich();
            ht.tinhChuVi();
            ht.inThongTin();
           //Hinh Tru Tron
           HinhTruTron htt = new HinhTruTron();
           htt.NhapThongTin();
           htt.tinhDienTich();
           htt.inThongTin();



    }
}
