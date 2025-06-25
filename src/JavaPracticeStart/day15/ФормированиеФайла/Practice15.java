package JavaPracticeStart.day15.ФормированиеФайла;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и размерах
        //обуви, которой нет на складе (количество = 0). Для этого реализуйте программу, которая принимает на вход csv
        // файл и создает новый txt файл следующего содержания (должно получиться 11 строк):
        //Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
        //Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
        //Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0

        //P.S.:Я не стал переписывать все содержимое shoes.csv файла, ограничился 4-мя экземплярами
        System.out.println("Задание 1");
        File file = new File("src/JavaPracticeStart/day15/shoes.csv");
        Abc(file);
    }


    public static void Abc(File file) throws FileNotFoundException {
        File file1 = new File("src/JavaPracticeStart/day15/missing_shoes.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(file1);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] strings = line.split(";");
            if (Integer.parseInt(strings[2]) == 0){
                pw.println(strings[0]+", "+strings[1]+", "+strings[2]);
            }
        }
        scanner.close();
        pw.close();
    }
}