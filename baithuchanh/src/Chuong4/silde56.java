package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class silde56 {
    public static void main(String[] args) {
        HashSet<String> hashSetString = new HashSet<>();
        String name;
        Scanner sc = new Scanner(System.in);
        hashSetString.add("Nguyen Van A ");
        hashSetString.add("Bui Van B ");
        hashSetString.add("Tran Ngoc C");
        hashSetString.add("Luong Duy D");

        //In ra hashSetString
        System.out.println("hashSetString: ");
        System.out.println(hashSetString);
        
        //xoa phan tu ra khoi danh sach
        System.out.println("nhap phan tu can xoa: ");
        name = sc.nextLine();
        if(!hashSetString.contains(name)){
            System.out.println("phan tu khong tin tai trong danh sach");
        }
        else{
            hashSetString.remove(name);
            System.out.println("phan tu da bi xoa ra khoi danh sach");
            System.out.println("hashSetString sau khi xoa phan tu la: ");
            System.out.println(hashSetString);
        }
        
    }
}
