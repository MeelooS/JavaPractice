package Задачи.TaskForTraining;

import java.util.*;

public class HashMapAndHashSet {
    //Пример работы HashMap и HashSet и их заполнение

    public static void main(String[] args){
        Map<Integer, String> map = Map.of(1,"M", 2,"H", 3,"R"); //при одинаковых ключах будет ошибка
        HashMap<Integer, String> hashMap = new HashMap<>(map);
//        ert(hashMap);

        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1,"M");
        hashMap1.put(1,"r");
        hashMap1.put(2,"M");
        ert(hashMap1);

        Set<Integer> set = Set.of(1,2,3,4);
        HashSet<Integer> hashSet = new HashSet<>(set);
        ert1(hashSet);
    }

    private static void ert(HashMap<Integer, String> hashMap){
        System.out.println(hashMap);
    }

    private static void ert1(HashSet<Integer> hashSet){
        System.out.println(hashSet);
    }
}
