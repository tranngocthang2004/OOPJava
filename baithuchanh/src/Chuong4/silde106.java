package Chuong4;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class silde106 {
    public static void main(String[] args) {
        TreeMap<Integer ,String > treeMap = new TreeMap<>();
        
        treeMap.put(1, "C++");
        treeMap.put(5, "Java");
        treeMap.put(3,"PHP");
        treeMap.put(2,"C#");
        treeMap.put(4,"Python");

        Set<Map.Entry<Integer,String>> setTreeMap = treeMap.entrySet();
        System.out.println("TreeMap");
        System.out.println(setTreeMap);
        
    }
}
