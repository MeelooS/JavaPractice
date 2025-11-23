package Задачи;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
   /* На вход подается список (лист интенджеров), написать метод, который удалит
    дубликаты данного листа и вернет пользователю список без дубликатов.*/

    //1-й способ
    public static void noDoplicate(List<Integer> e){
        Set<Integer> q = new HashSet<>(e);
        System.out.println(q);
    }


    //2-й способо
    public static void noDuplicate1(List<Integer> e){
        List<Integer> q = new ArrayList<>();
        for(Integer temp: e){
            if(!q.contains(temp)){
                q.add(temp);
            }
        }
        System.out.println(q);
    }

}
