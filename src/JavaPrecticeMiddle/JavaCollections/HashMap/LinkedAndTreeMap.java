package JavaPrecticeMiddle.JavaCollections.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedAndTreeMap {
    public static void main(String[] args){
//        Map<String, String> translations = new HashMap<>();
//        translations.put("кошка", "cat");
//        translations.put("собака", "dog");
//        translations.put("слон", "elephantcat");
//        for(Map.Entry<String,String> entry : translations.entrySet()){
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }
        Map<Integer,String> hashMap = new HashMap<>();                    //не гарантируется порядок
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();  //гарантируется порядок добавления пар ключ-значение, в таком порядке они и вернутся
        Map<Integer,String> treeMap = new TreeMap<>();                    //пары отсортируются по ключу (должен быть задан порядок сортировки)

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }

    public static void testMap(Map<Integer,String> map){
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
