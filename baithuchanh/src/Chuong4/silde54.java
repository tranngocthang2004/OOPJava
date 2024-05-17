package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class silde54 {
    public static void main(String[] args) {
    HashSet<Integer> hashSet = new HashSet<>();
    int number;
    Scanner sc = new Scanner(System.in);
    hashSet.add(1);
    hashSet.add(3);
    hashSet.add(5);
    hashSet.add(7);
    hashSet.add(2);
    hashSet.add(0);
    //in ra hashSet
    System.out.println("hashSet: ");
    System.out.println(hashSet);
    //Them phan tu vao hashSet
    System.out.println("nhap phan tu can them vao danh sach: ");
    number = sc.nextInt();

    if(!hashSet.contains(number)){
        hashSet.add(number);
        System.out.println("them phan tu thanh cong");
        System.out.println("hashSet sau khi them phan tru: ");
        System.out.println(hashSet);
    }
    else{
        System.out.println("phan tu "+number+" da ton tai");
    }

    }
}
