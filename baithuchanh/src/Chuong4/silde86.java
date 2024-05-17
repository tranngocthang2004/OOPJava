package Chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class silde86 {
    public static void main(String[] args) {
    HashMap<String , String> hashMap = new HashMap<>();

    hashMap.put("C++","C++");
    hashMap.put("CSLT", "Co So Lap Trinh");
    hashMap.put("C#","C Sharp");
    hashMap.put("Java","Java");
    hashMap.put("PHP","PHP");

    Set<Map.Entry<String ,String>>  setHashMap= hashMap.entrySet();
    System.out.println("cac entry trong danh sach la: ");
    System.out.println(setHashMap);
    }
}