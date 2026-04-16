package Задачи.TaskForTraining;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class йцу {
    // Реализуйте сортировку массива методом пузырька
    /*
                                                 Как работает алгоритм?
       1.Проходимся по массиву с начала до конца.
       2.На каждом шаге сравниваем соседние элементы:
       3.Если левый больше правого, меняем их местами.
       4.После одного прохода, самый большой элемент "всплывает" в конец массива.
       5.Повторяем проходы, игнорируя уже отсортированную часть массива (последние элементы).
                                                        Пример:
       Массив: [5, 2, 9, 1]

       Первый проход:
          1.Сравниваем 5 и 2 → меняем → [2, 5, 9, 1]
          2.Сравниваем 5 и 9 → не меняем
          3.Сравниваем 9 и 1 → меняем → [2, 5, 1, 9]
          4.Теперь 9 "всплыл" в конец.

       Следующий проход:
          1.сравниваем 2 и 5 → не меняем
          2.сравниваем 5 и 1 → меняем → [2, 1, 5, 9]
          И так далее, пока весь массив не станет отсортирован.
     */

    public static void main(String[] args){
        int[] arr = {2,12,4,3,6,7,10,1,5};
        qwe(arr);
    }

    public static void qwe(int [] arr){
        boolean swap;
        for(int i=0; i< arr.length-1; i++){
            swap=false;
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                   int r=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=r;
                   swap=true;
                }
            }
            if(!swap){
                System.out.println(Arrays.toString(arr));
                break;
            }
        }
    }

}
