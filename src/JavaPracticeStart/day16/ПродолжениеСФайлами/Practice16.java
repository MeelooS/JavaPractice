package JavaPracticeStart.day16.ПродолжениеСФайлами;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.Реализовать программу, которая на вход принимает txt файл с целыми числами (можно использовать файл из
        //задания 1 дня 14) и в качестве ответа выводит в консоль среднее арифметическое этих чисел.
        //Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного числа (со
        //всеми знаками после запятой) и сокращенную запись (с 3 знаками после запятой).
        //Детали реализации: В классе Task1 создать публичный статический метод printResult(File file), в котором
        //реализовать вышеописанную логику. В методе main() класса Task1 вызвать метод printResult(File file), передав
        //ему в качестве аргумента объект класса File (txt файл с целыми числами).

        //Пример:
        //Числа в txt файле: 5 2 8 34 1 36 77
        //Ответ: 23.285714285714285 --> 23,286
        System.out.println("Задание 1");
        File file = new File("Numbers.txt");
        printResult(file);

        //Реализовать программу, записывающую числа разных типов в 2 файла.
        //Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
        //Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.
        //Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
        //Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
        //Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее
        //арифметическое. Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться 50
        //вещественных чисел (1000 / 20 = 50).
        //После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
        //Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив
        //вещественную часть.
        System.out.println(" ");
        System.out.println("Задание 2");
        File file1 = new File("src/JavaPracticeStart/day16/file1.txt");
        PrintWriter printWriter = new PrintWriter(file1);
        Random random = new Random();
        for (int i=0; i<1000; i++){
            printWriter.println(random.nextInt(100));
        }
        printWriter.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("src/JavaPracticeStart/day16/file2.txt");
        PrintWriter printWriter1 = new PrintWriter(file2);
        int sum =0;
        int count =0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            sum = sum+ Integer.parseInt(line);
            count++;
            if (count==20){
                printWriter1.println((sum)/20.0);
                sum =0;
                count =0;
            }
        }

        printWriter1.close();


        printResult1(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] strings = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String string:strings){
            numbers.add(Integer.parseInt(string));
        }
        System.out.println("Числа в txt-файле: "+numbers);
        int sum = 0;
        for (int f:numbers){
            sum = sum+f;
        }
        double arif =  ((double)sum/numbers.size());
        System.out.printf("Ответ: "+arif+ " --> %.3f",arif);
    }

    public static void printResult1(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum=0;
        while (scanner.hasNextLine()){
            sum = sum + Double.parseDouble(scanner.nextLine());
        }
        System.out.println((int)sum);
    }
}