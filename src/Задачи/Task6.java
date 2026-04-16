package Задачи;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

    public static void main(String[] args){
         /*
            Написать метод, который перевернет строку
         */

        /*
        Пример String.join():
        String.join(",", Arrays.asList("apple", "banana", "cherry")) вернет "apple,banana,cherry".
        * */

        strReverse("abc");
        strReverse1("qwe");
        reverseStr1("zxc");

    }

    public static void strReverse(String str){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(str).reverse());
    }

    public static void strReverse1(String str){
        List<String> list = new ArrayList<>();
        for(int i = str.length()-1; i>=0; i--){
            list.add(String.valueOf(str.charAt(i)));
        }
        String result=String.join("",list);
        System.out.println(result);
    }


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
        String result = String.join("", arr);
        System.out.println(result);
    }
}
