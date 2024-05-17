package Chuong4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class silde60 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
    linkedHashSet.add("Java");
    linkedHashSet.add("C++");
    linkedHashSet.add("PHP");
    linkedHashSet.add("C#");
    linkedHashSet.add("Java");
    // in ra linkedHashSet
    System.out.println("linkedHashSet: ");
    for(String str : linkedHashSet){
        System.out.println(str);
    }
    //xoa phan tu chi dinh 
    String name ;
    System.out.println("Nhap phan tu can xoa: ");
    name = sc.nextLine();
    if(!linkedHashSet.contains(name)){
        System.out.println("phan tu da ton tai trong danh sach");
    }else{
        linkedHashSet.remove(name);
        System.out.println("xoa thanh cong phan tu");
        System.out.println("linkedHashSet sau khi da xoa phan tu la: ");
        for(String str : linkedHashSet){
            System.out.println(str);
    }
    
    }
}
}