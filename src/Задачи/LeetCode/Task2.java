package Задачи.LeetCode;

import java.io.IOException;
import java.util.Arrays;

public class Task2 {
    /*
    Реализовать метод, который будет проверять числа на полиндромность (будет выводить true)

    Пример 1:
    Input: x = 123
    Output: 321

    Пример 2:
    Input: x = -123
    Output: -321

    Example 3:
    Input: x = 120
    Output: 21
    */

    /*
    Math.abs() - возвращает модуль числа
    Math.abs(5)=5;
    Math.abs(-5)=5;
    */

    public static void main(String[] args){


        reverse(1200);
    }


    public static void reverse(int n){
        String numString = String.valueOf(Math.abs(n));
        String strCount= "";
        if(n%10==0){
            for(int i=numString.length()-1; i>=0; i--){
                if(numString.charAt(i)=='0'){
//                    continue;    //можно оставить строку пустой, типо ничего не делаем
                } else {
                    strCount+=numString.charAt(i);
                }
            }
            System.out.println(strCount);
        }
        else if(n<0){
            for(int i=numString.length()-1; i>=0; i--){
                strCount+=numString.charAt(i);
            }
            System.out.println("-"+strCount);
        }
        else {
            for(int i=numString.length()-1; i>=0; i--){
                strCount+=numString.charAt(i);
            }
            System.out.println(strCount);
        }
    }


    public static void reverse1(int x){
        int result; //переменная, куда помещаем переведенную в int получившуюся строку
        String absStr = String.valueOf(Math.abs(x)); //т.к. '-' в строке является исмволом и без модуля он станет в самый конец после цикла
        String str1="";
        for(int i=absStr.length()-1; i>=0; i--){
            str1+=String.valueOf(absStr.charAt(i));
        }

        //parseInt()-превращает строку в число (int) и избавляется от всех нулей, т.е. если в строке получилось 0021, то станет 21
        result=Integer.parseInt(str1);
        if(x<0){
            result=-result; //чтобы поставить - на первое место
        }

        System.out.println(result);
    }
}