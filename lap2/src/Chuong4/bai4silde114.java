import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class bai4silde114 {
    public static void main(String[] args) {
        HashSet<String> hashSet= new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String TraiCay;
        System.out.println("nhap ten trai cay(nhap exit de dung lai): ");
        while(true){
            TraiCay =sc.nextLine();
            if(TraiCay.equals("exit")){
                    break;
            }
            hashSet.add(TraiCay);
        }
        System.out.println("kich thuoc cua danh sach: "+ hashSet.size());
        System.out.println("-------------------------");
        String TraiCayCanTim;
        System.out.println("Nhap ten loai trai cay can tim:");
        TraiCayCanTim=sc.nextLine();
        if(hashSet.contains(TraiCayCanTim)){
            System.out.println("trai cay nay co trong danh sach");
        }
        else{
            System.out.println("trai cay can tim khong co trong danh sach");
        }
        System.out.println("-------------------------");
        String TraiCayCanXoa;
        System.out.print("Nhap ten loai trai cay can xoa: ");
        TraiCayCanXoa=sc.nextLine();
        if(hashSet.contains(TraiCayCanXoa)){
            hashSet.remove(TraiCayCanXoa);
            System.out.println("xoa thanh cong");
        }else{
            System.out.println("trai cay can xoa khong co tron danh sach");
        }
        System.out.println("-------------------------");
        System.out.println("hashSet:");
        System.out.println("hashSet sau khi xoa: ;'l");
        for(String str : hashSet){
            System.out.println(str);
        }  
        System.out.println("-------------------------");

        //tao mot list co cung kieu voi hashSet
        List<String> list = new ArrayList<>();
        System.out.println("nhap ten trai cai( dung lai khi nhap exit): ");
        while(true){
        TraiCay=sc.nextLine();
        if(TraiCay.equals("exit")){
                break;
        }
            list.add(TraiCay);
        }
        hashSet.addAll(list);//them tat ca nhung phan tu trong list vao hashset
        Iterator<String> iterator = hashSet.iterator() ;
        System.out.println("hashset sau khi them nhung phan tu cua list vao danh sach:");
        while(iterator.hasNext()){
            String Qua = iterator.next();
            System.out.println(Qua);
        }
        System.out.println("-------------------------");
        hashSet.removeAll(list);// xoa nhung phan tu trong list ra khoi hashset
        System.out.println("hashset sau khi xoa nhung phan trong list: ");
        iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String Qua = iterator.next();
            System.out.println(Qua);
        }

    }

}
