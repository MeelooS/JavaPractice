package Задачи.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    /*
    Римские числа представлены различными символами: I, V, X, L, C, D and M.
    Реализовать метод, который на вход берет символы, а возвращать будет числа

    Symbol       Value
     I             1
     V             5
     X             10
     L             50
     C             100
     D             500
     M             1000

     Пример1:
     Input: s = "III"
     Output: 3
     Explanation: III = 3.

     Пример2:
     Input: s = "LVIII"
     Output: 58
     Explanation: L = 50, V= 5, III = 3.

     Пример3:
     Input: s = "MCMXCIV"
     Output: 1994
     Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */

    public static void main(String[] args){
        romanToInt("LVIII");    // 50+5+3=58
        romanToInt("III");      // 3
        romanToInt("MCMXCIV");  //1000+900+90+4=1994
    }


    public static void romanToInt(String s) {   //III
        int sum=0;
        int podSum=0;
        Map<String, Integer> map= new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        List<String> list = new ArrayList<>();

        //Добавляем в лист символы строки по отдельности, а не всю строку сразу
        for(int i=0; i<s.length(); i++){
            list.add(String.valueOf(s.charAt(i)));
        }

        //Сравниваем значения по ключу: если значение символа меньше последующего, то берем их в паре. Иначе берем по одному
        for(int i=0; i<list.size()-1; i++){
            if(map.get(list.get(i))<map.get(list.get(i+1))){
                podSum=map.get(list.get(i+1))-map.get(list.get(i));
                sum+=podSum;
                i++;
            }
            //Доп. else-if, т.к. на предпоследнем элементе выходим из цикла (т.к. <list.size()-1) и последний элемент в расчет не берется.
            //Чтобы это исправить необходимо прописать это условие
            else if (i==list.size()-2) {
                sum+=map.get(list.get(i))+map.get(list.get(i+1));
            } else {
                sum+=map.get(list.get(i));
            }
        }

        System.out.println(sum);

    }
}