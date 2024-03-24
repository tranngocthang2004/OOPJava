package Person;

public class Main {
    public static void main(String[] args) {
        EmployeeFulltime employeeFulltime=new EmployeeFulltime();
        employeeFulltime.NhapThongTin();
        employeeFulltime.TinhLuong();
        employeeFulltime.InThongTin();
        //Nhan vien parttime
        EmployeePartime employeePartime=new EmployeePartime();
        employeePartime.NhapThongTin();
        employeePartime.TinhLuong();
        employeePartime.InThongTin();
    }
}
