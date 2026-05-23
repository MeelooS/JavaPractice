package Задачи.TaskForTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T7 {
    /*
    На вход приходит любое число.Необходимо сложить цифры числа. Пример: 99 → 18 , 123 → 6
     */

    /*
    Integer.valueOf(char) - вернет кодированное значение, например '9'=57
    Нужно сначала '9' перевести в String

    Integer.parseInt() — преобразует строковое представление числа (String) в примитивный тип данных int
     */

    public static void main(String[] args){
        sum(88);

    }

    public static void sum(int q){
        String str = String.valueOf(q);
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            list.add(String.valueOf(str.charAt(i)));
        }
        int sum=0;
        for(String aa: list){
            sum+=Integer.parseInt(aa);
        }
        System.out.println(sum);
    }
}