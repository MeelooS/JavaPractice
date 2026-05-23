package Задачи.TaskForTraining;

import java.util.ArrayList;
import java.util.List;

public class T9 {
    /*
    Перевернуть строку без использования реверс в StringBuilder
     */

    public static void main(String[] args){

//        System.out.println(ert("Qwert"));
    }

    public static void reverse(String str){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(str).reverse());
    }

    public static void reverse1(String str){
        String str1="";
        for (int i=str.length()-1; i>=0; i--){
            str1=str1+str.charAt(i);
        }
        System.out.println(str1);
    }
}