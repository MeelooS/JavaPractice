package Задачи.TaskForTraining;

public class T4 {
    /*
    Написать функцию, реализующую нахождение факториала (рекурсивно и нет)
     */

    public static void main(String[] args){

//        System.out.println(fact(4));
//        System.out.println(fact(5));


    }


    public static void factorial(int h){
        int y=1;
        for(int i=h; i>0; i--){
            y=y*i;
        }
        System.out.println(y);
    }

    public static int recursiveFactorial(int h){
        if(h==0 || h==1){
            return 1;      //вернули 1 и вышли
        }
        return h*recursiveFactorial(h-1);  //вернули значение, но не выходим, т.к. тут рекурсия
    }




}