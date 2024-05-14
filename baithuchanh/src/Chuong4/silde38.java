
package Chuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class silde38 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        int Size;
        System.out.println("so nguoi can nhap thong tin: ");
        Size= sc.nextInt();
        sc.nextLine();
        for(int i =0; i< Size ; i++){
            String Data ;
            System.out.print("Nhap ho ten: ");
            Data = sc.nextLine();
            linkedList.add(Data);
       }
       LinkedList<String> linkedList2 = new LinkedList<>();
       linkedList2.add("Tran Ngoc Thang");
       linkedList2.add("Pham Van An");
       linkedList2.add("Nguyen Van Duc");
       linkedList2.add("Nguyen Trong Giap");
       linkedList2.add("Nguyen Duy Dung");

       //Noi phan tu cua danh sach linkedList2 vao sau danh sach linkedList
       linkedList.addAll(linkedList2);
       // lay ra phan tu thu 5 trong danh sach linkedlist2
       System.out.println("phan tu dau tien trong danh sach la: "+ linkedList2.getFirst());
       System.out.println("---------------------------");
       //Show linkedlist
       System.out.println("linkedList: ");
       for(int i=0;i < linkedList.size();i++){
        System.out.println(linkedList.get(i));
   }
       System.out.println("---------------------------");
       //Xoa phan tu tu linkedList2 khoi linkedList
       //Show LinkedList sau khi xoa Linkedlist 2
       linkedList.removeAll(linkedList2);
       System.out.println("linkedList sau khi xoa linkedList2: ");
       for(int i=0;i < linkedList.size();i++){
            System.out.println(linkedList.get(i));
       }
    }
}
       
