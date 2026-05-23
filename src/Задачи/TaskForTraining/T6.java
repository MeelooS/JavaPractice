package Задачи.TaskForTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T6 {
    /*
     Написать метод, который принимает число и возвращает ответ - принадлежит ли это число списку Фибоначчи
     (каждое следующее число - сумма двух предыдущих)? (ограничение до 1 млн)
     0,1,1,2,3,5,8,13,21,34,55,...
     */
    public static void main(String[] args){
//        System.out.println(ert(3));
    }


                                                     //Через цикл while
    public static boolean numberInFibonacci(int num){
        if (num < 0) {
            return false;
        }
        int a = 0;
        int b = 1;

        while (a <= 1000000) {
            if (num == a) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }


                                                         //Через цикл for
        public static boolean isFibonacciNumber(int num){
            if(num<0){
                return false;
            }
            int q=0;
            int q1=1;
            for(int i=q; i<=1000000; i=q1){
                if(num==q || num==q1){
                    return true;
                }
                int sum=q+q1;
                q=q1;
                q1=sum;
            }
            return false;
        }
}