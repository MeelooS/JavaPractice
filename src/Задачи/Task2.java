package Задачи;

import java.util.List;

public class Task2 {
    /* На вход подается список (лист интеджеров), написать метод, который найдет
       максимальное значение*/

    public static void max(List<Integer> l){
        Integer max = l.get(0);
        for (Integer temp: l){
            if(max<temp){
                max=temp;
            }
        }
        System.out.println(max);
    }
}
