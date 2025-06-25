package JavaPracticeStart.day2.ЦиклыИScanner;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        //1.Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число,
        // соответствующее количеству этажей в здании. Используя условный оператор if, необходимо вывести в консоль
        // сообщение о типе такого дома.
        //Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более- “Многоэтажный дом”.
        // Так же, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить
        // “Ошибка ввода”.
        System.out.println("Задание 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во этажей: ");
        int s = scanner.nextInt();
        if(s>=1&&s<=4){
            System.out.println("Малоэтажный дом");
        } else if(s>=5&&s<=8){
            System.out.println("Среднеэтажный дом");
        } else if(s>=9){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

        //2.Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b). Используя цикл
        // for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка, но при этом не делятся
        // на 10 без остатка. Сами числа a и b в диапазоне не учитывать. Если a >= b вывести сообщение "Некорректный
        // ввод".
        System.out.println();
        System.out.println("Задание 2");
        System.out.print("Вводим в консоли: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Вывод: ");
        for(int i=a+1; i<b; i++){
            if (i%5==0 && i%10!=0){
                System.out.print(i+" ");
            }
        }
        if (a>=b){
            System.out.println("Неккоректный ввод");
        }

        //3.Реализовать программу No2, используя цикл while.
        System.out.println();
        System.out.println();
        System.out.println("Задание 3");
        System.out.print("Вводим в консоли: ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int i1=a1+1;
        System.out.print("Вывод: ");
        while (i1>a1&&i1<b1){
            i1=i1+1;
            if (i1%5==0 && i1%10!=0){
                System.out.print(i1+" ");
            }
        }
        if (a1>=b){
            System.out.println("Неккоректный ввод");
        }

        //4. {(x^2-10)/(x+7);  x>=5
        // y={(x+3)(x^2-2);    -3<x<5
        //   {420};            Во всех остальных случаях
        // Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x. Для этого
        // числа, по формуле выше, необходимо вычислить значение y. (Для этих вещественных чисел x и y необходимо
        // использовать тип double и метод nextDouble() у Scanner’а соответственно, чтобы считать из консоли число x).
        System.out.println();
        System.out.println();
        System.out.println("Задание 4");
        System.out.print("Вводим в консоли: ");
        double x = scanner.nextDouble();
        double y;
        System.out.print("Вывод: ");
        if(x>=5){
            y=(Math.pow(x,2)-10)/(x+7);
            System.out.print(y);
        } else if (x>-3&&x<5){
            y=(x+3)*(Math.pow(x,2)-2);
            System.out.print(y);
        } else {
            y=420;
            System.out.print(y);
        }
    }
}
