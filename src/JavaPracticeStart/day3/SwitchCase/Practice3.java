package JavaPracticeStart.day3.SwitchCase;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        //1.Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
        // Программа должна работать до тех пор, пока не будет введено слово “Stop”.
        //Реализовать, используя следующие данные:
        //Москва, Владивосток, Ростов - Россия
        //Рим, Милан, Турин - Италия
        //Ливерпуль, Манчестер, Лондон - Англия
        //Берлин, Мюнхен, Кёльн - Германия
        //При вводе любого другого города, вывести сообщение “Неизвестная страна”.
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Ваш ввод в консоль: ");
            String str = scanner.nextLine();
            if(str.equals("Stop")){
                System.out.println("Программа завершила работу");
                break;
            }
            switch (str){
                case "Москва" :
                    System.out.print("Россия - ответ программы\n");
                    break;
                case "Владивосток" :
                    System.out.print("Россия - ответ программы\n");
                    break;
                case "Ростов" :
                    System.out.print("Россия - ответ программы\n");
                    break;
                case "Рим" :
                    System.out.print("Италия - ответ программы\n");
                    break;
                case "Милан" :
                    System.out.print("Италия - ответ программы\n");
                    break;
                case "Турин" :
                    System.out.print("Италия - ответ программы\n");
                    break;
                case "Ливерпуль" :
                    System.out.print("Англия - ответ программы\n");
                    break;
                case "Манчестер" :
                    System.out.print("Англия - ответ программы\n");
                    break;
                case "Лондон" :
                    System.out.print("Англия - ответ программы\n");
                case "Берлин" :
                    System.out.print("Германия - ответ программы\n");
                    break;
                case "Мюнхен" :
                    System.out.print("Германия - ответ программы\n");
                    break;
                case "Кёльн" :
                    System.out.print("Германия - ответ программы\n");
                    break;
                default:
                    System.out.print("Неизвестная страна\n");
            }
        }

        //2.Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и
        // делитель. Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль. Программа
        // останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя. (для этих вещественных
        // чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).
        System.out.println();
        System.out.println("Задание 2");
        while (true){
            System.out.print("Ваш ввод в консоль: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b==0){
                System.out.println("Работа программы завершается");
                break;
            }
            System.out.println(a/b + " - ответ программы");
        }

        //3.Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель. Для этих
        // двух чисел программа рассчитывает результат деления и выводит его в консоль. Если пользователь вводит 0 в
        // качестве делителя, вместо того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
        //выводим в консоль сообщение “Деление на 0”. Ключевое слово else использовать в этой программе нельзя.
        System.out.println();
        System.out.println("Задание 3");
        for (int i=1;i<=5;i++){
            System.out.print("Ваш ввод в консоль: ");
            double a1 = scanner.nextDouble();
            double b1 = scanner.nextDouble();
            if(b1==0){
                System.out.println("Деление на 0 - ответ программы");
                continue;
            }
            System.out.println(a1/b1 + " - ответ программы");
        }
    }
}
