package Задачи;

import java.util.ArrayList;

public class Task6 {
    /*
    Написать метод, который перевернет строку
     */
    public static void reverseStr(String s){
        StringBuilder s1 = new StringBuilder();
        System.out.println(s1.append(s).reverse());
    }

    public static void reverseStr1(String s){
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<=s.length()-1; i++){
            //Метод String.valueOf() используется для преобразования различных примитивных типов данных
            arr.add(String.valueOf(s.charAt(s.length()-1-i)));
        }
        System.out.println(arr);
    }
}
