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

        int [] array = {1,2,3,7,8,9};
        int [] array1 = {1,2,4,5,6,10};
        int [] array2 = {1,2,4,5,11,10};

        test1(array1);
    }


    public static void test1(int[] arr){
        int count=0;
        int f=0;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i]==arr[i+1]-1){
                count++;
                if(count==2){
                    f++;
                }
            } else {
                count=0;
            }
        }
        if(f>=1){
            System.out.println(f+" Массив содержит 3 последовательных числа");
        } else {
            System.out.println(f+" Массив не содержит 3 последовательных числа");
        }
    }


    public static void test(int [] array){
        int count =0;
        for(int i=0; i< array.length-2; i++){           //-2, т.к. мы сразу проверяем i+2. Иначе такая проверка может выйти за пределы массива
            if(array[i]==array[i+1]-1 && array[i]==array[i+2]-2){
                count++;
            }
        }
        System.out.println("Массив содержит 3 последовательных числа "+ count+" раз");
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


}
