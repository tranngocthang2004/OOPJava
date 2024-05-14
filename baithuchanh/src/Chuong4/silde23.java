package Chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class silde23 {
    public static void main(String[] args) {
        
    ArrayList<Integer> arrayList=new ArrayList<>();
    int Size;
    int  Number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap kich thuoc mang: ");
    Size = sc.nextInt();
    sc.nextLine();
    for(int i=0;i<Size;i++){
        System.out.println("Nhap phan tu thu "+(i)+" cua mang: ");
        Number=sc.nextInt();
        arrayList.add(Number);
    }
    int max = arrayList.get(0);
    for(int i= 1;i<arrayList.size();i++){
        if(max<arrayList.get(i)){
            max=arrayList.get(i);
        }
    }
    System.out.println("Phan tu lon nhat trong mang la: "+max);
}
}
