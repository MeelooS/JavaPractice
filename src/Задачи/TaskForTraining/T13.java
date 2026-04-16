package Задачи.TaskForTraining;

public class T13 {
    //Напишите метод для проверки числа на простоту.
    //Простые числа — это натуральные числа больше 1, которые делятся без остатка только на 1 и на самих себя.
    public static void main(String[] args){
        simpleNumb(4);
    }


    public static void simpleNumb(int n){
        if(n<=1){
            System.out.println("Число "+n+" не является простым");
        }
        if(n%1==0 && n%n==0 && n%Math.sqrt(n)!=0){
            System.out.println("Число "+n+" простое");
        } else {
            System.out.println("Число "+n+" не является простым");
        }
    }

}
