package Chuong4;
import java.util.ArrayList;
import java.util.Iterator;

public class silde21 {
    public static void main(String[] args) {
    
    
    ArrayList<Integer> arrayList=new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(4);
    arrayList.add(5);

    System.out.println("phan tu dau tien trong danh sach "+arrayList.get(1));
    System.out.println("vi tri cua phan tu mang so 5 la: "+arrayList.indexOf(5));
    Iterator iterator= arrayList.iterator();
    
    System.out.println("cac phan tu trong mang la: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }
}
