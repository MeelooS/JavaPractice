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
//        System.out.println(QQQ(123));

    }

    public static int QQQ(int u){
        String str = String.valueOf(u);
        int[] arr=new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int sum=0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static int sum(int g){
        String stringG=String.valueOf(g);
        List<String> list = new ArrayList<>();
        int result=0;
        for (int i=0; i<stringG.length(); i++){
            list.add(String.valueOf(stringG.charAt(i)));
        }
        for (int z=0; z< list.size(); z++){
            result=result+Integer.parseInt(list.get(z));
        }
        return result;
    }
}
