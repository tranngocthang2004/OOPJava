package Chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class silde88 {
    public static void main(String[] args) {
    HashMap<String,String> hashMap = new HashMap<>();
    
    hashMap.put("TH", "Thanh Hoa");
    hashMap.put("HN", "Ha Noi");
    hashMap.put("HCM", "Ho Chi Minh");
    //in ra danh sach vua nhap
    Set<Map.Entry<String ,String>>  setHashMap= hashMap.entrySet();
    System.out.println(setHashMap);

    
    System.out.println("TH: " +hashMap.get("TH"));

    if(hashMap.containsKey("TH")== true){
        System.out.println("co thanh ph thanh hoa trong danh sach");
    }
    else{
        System.out.println("thanh pho khong nam trong danh sach");
    }
}
}

