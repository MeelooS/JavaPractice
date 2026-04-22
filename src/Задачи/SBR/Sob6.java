package Задачи.SBR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sob6 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,11);
        list.stream()
                .peek(System.out::println)
                .filter(x->x>10);
        System.out.println();
        //Ничего не выведется, т.к. Stream - ленивая операция и без финальной-терминальной команды, stream не будет
        //выполняться

                                                //Правильные варианты
        List<Integer> list1 = Arrays.asList(1,2,3,4,11);
        list1.stream()
                //peek()-вызывает указанное действие, выполняемое для всех элементов. Поэтому сначала он выведет все эл-ты,
                //а затем выведется отсортированный элемент 11. Поэтому для вывода только 11 его коммитим
//                .peek(System.out::println)
                .filter(x->x>10)
                .forEach(System.out::println);


        List<Integer> list2 = Arrays.asList(1,2,3,4,11);
        System.out.println(list2.stream()
                .filter(x->x>10)
                .collect(Collectors.toList()));
    }
}