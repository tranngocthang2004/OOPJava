import java.util.LinkedList;
import java.util.Scanner;

public class bai2silde112 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("nhap kich thuoc cua mang: ");
        size =sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("nhap phan tu them vao: ");
            int number = sc.nextInt();
            linkedList.add(number);
        }
        float TrungBinhCong;
        float Tong=0;
        int dem=0;
        for(int i =0 ; i<linkedList.size();i++){
            if(linkedList.get(i)%2==0&&linkedList.get(i)!=0){
                dem++;
                Tong = Tong+linkedList.get(i);
            }
        }
        TrungBinhCong= Tong/dem;
        System.out.println("trung binh cong cac so chan trong danh sach la: "+ TrungBinhCong);
    }
}
