package Задачи.SBR;

import java.util.ArrayList;
import java.util.Arrays;

/*
var — это ключевое слово для автоматического выведения типа локальных переменных.
Компилятор сам определяет тип на основе присваиваемого значения, что сокращает код.

var message = "Hello, World!"/String message = "Hello, World!"                  // Компилятор поймет, что это String
Map<String, List<Integer>> map = new HashMap<String, List<Integer>>()/var map = new HashMap<String, List<Integer>>();
 */
public class Sob4 {

    public static void main(String[] args){
        var list = new ArrayList<>();
        //Переменная list2 ссылается на тот же объект, что и list, поэтому любые изменения, внесённые через одну
        //переменную, отображаются в другой.
        var list2 = list;
        list.add("a");
        list.add("b");
        list2.add("c");

        /*
        Можно просто обойтись System.out.println(list) и System.out.println(list2), т.к.
         */
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));

//        Вывод
//        [a, b, c]
//        [a, b, c]
    }
}
