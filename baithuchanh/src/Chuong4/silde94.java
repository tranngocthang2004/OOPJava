package Chuong4;

import java.util.LinkedHashMap;
import java.util.Set;

public class silde94 {
    public static void main(String[] args) {
    LinkedHashMap<Integer , String>  linkedHashMap = new LinkedHashMap<Integer,String>();
    
    linkedHashMap.put(1, "Java");
    linkedHashMap.put(3,"C++");
    linkedHashMap.put(2,"HPH");
    linkedHashMap.put(4,"Python");
    //in ra linkedHashMap 
    System.out.println("linkedHashMap: ");
    show(linkedHashMap);
    System.out.println("----------------------");
    //xoa phan tu 
    linkedHashMap.remove(2);
    System.out.println("linkedHashSet sau khi xoa: ");
    show(linkedHashMap);

     }
    public static void show(LinkedHashMap<Integer,String> linkedHashMap ){
        Set<Integer> setKey =linkedHashMap.keySet();
        for(Integer key : setKey){
            System.out.println(key +" "+linkedHashMap.get(key));
        }
        

    }

        
}
