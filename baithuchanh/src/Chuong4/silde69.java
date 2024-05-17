package Chuong4;

import java.util.Scanner;
import java.util.TreeSet;

public class silde69 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(5);
        int number;
        Scanner sc = new Scanner(System.in);
        //in ra TreeSet
        System.out.println("treeSet: ");
        System.out.println(treeSet);

        //Them phan tu ra khoi danh sach
        System.out.println("nhap phan tu can them: ");
        number = sc.nextInt();
        if(!treeSet.contains(number)){
            treeSet.add(number);
            System.out.println("them phan tu thanh cong");
            System.out.println("danh sach sau khi them la: ");
            System.out.println(treeSet);
        }else{
            System.out.println("phan tu da xuat hien trong danh sach");
        }
    }
}
