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
//        System.out.println(QQQ(3));
    }


                                                     //Через цикл while
    public static boolean numberInFibonacci(int num){
        if(num<0){
            System.out.println("Число не может быть меньше 0!");
            return false;
        }
        //Ряд Фибоначчи начинается с 0,1,1,2,3,5 и т.д.
        int a = 0;   //задаем 1-е число из ряда
        int b = 1;   //задаем 2-е число из ряда
        List<Integer> list = new ArrayList<>();  //создаем лист, куда будет заноситься весь ряд Фибоначчи
        list.add(a);  //добавили 1-е число в лист
        while (a<=1000000){  //создаем работающий цикл вплоть до 1 млн
            list.add(b);  //на каждом цикле будем добавлять следующее число, являющееся суммой 2-х предыдущих
            int next = a+b; //создали переменную, куда будем складывать сумму 2-х предыдущих чисел
            a  = b;  //приравняем 1-е число к следующему, т.е. ушли вправо на 1 индекс
            b = next;  //приравняли 2-е число к к переменной суммы
        }
        for(Integer p:list){
            if(list.contains(num)){
                System.out.println("Число "+num+" принадлежит ряду Фибоначчи");
                return true;
            }
        }
        System.out.println("Число "+num+" не принадлежит ряду Фибоначчи");
        return false;
    }


                                                         //Через цикл for
    public static void fibunacci(int rty){
        if(rty<0){
            System.out.println("Число не может быть <0");
            return;
        }
        int k =0;
        int f =1;
        List<Integer> list = new ArrayList<>();
        list.add(k);
        for(int q=0; q<=1000000; q=k){  //Неправильно использовать q++, т.к. мы должны реализовать не 1 млн. чисел в списке Фибоначчи, а максимальное число, в котором должно быть не больше 1млн
            list.add(f);
            int next = k+f;
            k=f;
            f=next;
        }
        for(Integer pp:list){
            if(list.contains(rty)){
                System.out.println("Число "+rty+" принадлежит ряду Фибоначчи");
                return;
            } else{
                System.out.println("Число "+rty+" не принадлежит ряду Фибоначчи");
                return;
            }
        }
    }

                                                         //Без динамического списка
    public static boolean isFibonacciNumber(int num) {
        // Числа в ряде Фибоначчи не могут быть отрицательными,
        // так что если число отрицательное, сразу возвращаем false
        if (num < 0) {
            return false;
        }
        // Генерируем числа Фибоначчи до 1 миллиона или пока не превысим число
        int a = 0;
        int b = 1;

        while (a <= 1000000) {
            //Не можем написать тут условие if (num!=a){ return false}, т.к. условие сразу выполнится и нам вернется false.
            //Нужно, чтобы каждый раз происходило сравнение и цикл повторялся
            if (num == a) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }


}