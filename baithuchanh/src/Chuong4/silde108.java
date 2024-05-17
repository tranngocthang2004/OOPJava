package Chuong4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class silde108 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1, "C++");
        treeMap.put(5, "Java");
        treeMap.put(3,"PHP");
        treeMap.put(2,"C#");
        treeMap.put(4,"Python");
        
        
        //Thay the phan tu thu 4 trong danh sach 
        treeMap.replace(4, "JavaScript");
        Set<Map.Entry<Integer,String>> setTreeMap = treeMap.entrySet();
        System.out.println("TreeMap");
        System.out.println(setTreeMap);
    }
}
