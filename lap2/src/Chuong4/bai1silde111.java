import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1silde111{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so so nguyen can them vao danh sach: ");
        int size = sc.nextInt();
        //nhap vao 1 day so nguyen 
        for(int i = 0; i < size;i++){
            System.out.print("Nhap so nguyen : ");
            int number = sc . nextInt();
            arrayList.add(number);
         }
        //tim gia tri lon nhat trong mang vua nhap 
        int max = arrayList.get(0);
        for(int i = 1; i<arrayList.size();i++){
            if (max< arrayList.get(i)){
                max = arrayList.get(i);
            }
        }
        System.out.println("gia tri lon nhat trong mang la: "+ max);
        //nhap so nguyen sau do xoa nhung phan tu bang so nguyen trong man
        int number;
        System.out.print("nhap so nguyen bat ky: ");
        number=sc.nextInt();
        if(!arrayList.contains(number)){
            System.out.println("khong co gia trin nao trong mang bang so vua nhap");
        }
        else{
            for(int i = 0;i<arrayList.size();i++){
                if(arrayList.get(i)==number){
                    arrayList.remove(i);
                }
            }
            System.out.println("xoa thanh cong");
        }
        System.out.println(arrayList);
        //Sap xep day so
        Collections.sort(arrayList);
        System.out.println("mang sau khi duoc sap xep");
        System.out.println(arrayList);
}
}