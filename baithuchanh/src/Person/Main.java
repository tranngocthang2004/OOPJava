package Person;

public class Main {
    public static void main(String[] args) {
        EmployeeFulltime employeeFulltime=new EmployeeFulltime();
        employeeFulltime.NhapThongTin();
        employeeFulltime.NhapNgayLamViec();
        employeeFulltime.TinhLuong();
        employeeFulltime.XuatThongTin();
        //Nhan vien parttime
        EmployeePartime employeePartime=new EmployeePartime();
        employeePartime.NhapThongTin();
        employeePartime.NhapGioLam();
        employeePartime.TinhLuong();
        employeePartime.XuatThongTin();
    }
}
