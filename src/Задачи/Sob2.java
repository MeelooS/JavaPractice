package Задачи;

import java.util.ArrayList;
import java.util.List;

public class Sob2 {

    /*
    Исправить метод, который возвращает true, если поданный на вход массив int содержит 3 и более последовательных числа в любом месте.
    Алгоритм решения менять нельзя, реализация должна остаться через counter.
    Число 3 указано для того, чтобы было проще дебажить метод.
    Предполагается, что метод можно будет масштабировать до 100+ последовательных чисел в любом месте

     */

    public static void main(String[] args) {
        int [] array = {1,2,3,7,8};
        System.out.println(testMethod1(array,3));

        System.out.println();
        List<Integer> i1 = List.<Integer>of(2, 4, 5, 3, 9, 10);
        System.out.println(testMethod(i1,3));
    }


    public static boolean testMethod(List<Integer>e, int count){
        int counter = 0;
        for (int i=0; i<e.size()-1; i++) {
            if (e.get(i)== e.get(i+1) - 1) {
                counter++;
                if(counter == count-1){
                    return true;
                }
            } else{
                counter = 0;
            }
        }
        return false;
    }

    public static boolean testMethod1(int[] myArr, int count){
        int counter = 0;
        for (int i=0; i<myArr.length-1; i++) {
            if (myArr[i]== myArr[i+1] - 1) {
                counter++;
                if(counter == count-1){   //Т.к. count=3 -> 1,2,3   counter=0 -> 0,1,2  Поэтому это условие конца 2 = 3-1
                    return true;
                }
            } else{
                counter = 0;
            }
        }
        return false;
    }

    public static boolean testMethod2(int[] myArr){
        int counter = 0;
        for (int i=0; i<myArr.length-1; i++) {
            if (myArr[i]== myArr[i+1] - 1) {
                counter++;
                if(counter == 2){
                    return true;
                }
            }
            else{
                counter =0;
            }
        }
        return false;
    }


    //неправильно, т.к. array содержит Integer, а пароль это String
//    public static void checkPwOnSpecSymbols(String pw){
//        List<Integer> array = new ArrayList<>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        for(int i=0; i<pw.length()-1; i++){
//            if (array.contains(pw.charAt(i))){               //мб Integer.ValueOf
//                System.out.println ("Пароль содержит цифры");
//            }}}
//
}
