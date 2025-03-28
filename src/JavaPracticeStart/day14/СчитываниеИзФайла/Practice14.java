package JavaPracticeStart.day14.СчитываниеИзФайла;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args){
        //1.Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30). Заполнить его вручную
        //десятью произвольными числами. Реализовать статический метод printSumDigits(File file), который считает сумму
        //всех чисел в этом файле и выводит ее на экран. Вызвать данный метод в методе main(). Если файла не существует
        //в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не
        //найден”. Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и выводить в
        //консоль сообщение “Некорректный входной файл”.
        System.out.println("Задание 1");
        File file = new File("Numbers.txt");
        Practice14.printSumDigits(file);

        System.out.println();
        System.out.println("Задание 2");
        //2.Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей. Реализовать статический
        //метод List<String> parseFileToStringList(), который считывает содержимое этого файла и возвращает список,
        //состоящий из значений имен и возрастов каждого человека. Получить данный список в методе main() и распечатать
        //его в консоль. В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать
        //исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
        //необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
        Practice14.parseFileToStringList();

        System.out.println();
        System.out.println("Задание 3");
        //3.Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод List<Person>
        //parseFileToObjList(), который считывает содержимое того же файла people.txt, создает экземпляры класса
        //“Человек” и возвращает список объектов. Получить данный список в методе main() и распечатать его в консоль.
        //В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
        //в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо
        // выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
        parseFileToObjList();
    }

    public static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strings = line.split(" ");
            List<Integer> numbers=new ArrayList<>();
            for(String string:strings){
                numbers.add(Integer.parseInt(string));
            }

            if(numbers.size()!=10){
                throw new IllegalArgumentException();
            }

            System.out.println(numbers);
            int q=0;
            for(Integer int1:numbers){
                q=q+int1;
            }
            System.out.println(q);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<String> parseFileToStringList(){
        File file1 = new File("people.txt");
        List<String>people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()){                      //цикл while нужен для считывания каждой новой строки,
                String line = scanner.nextLine();               //цикл for подходит только для работы с одной строкой,
                people.add(line);                               //т.е. с массивом
                String[] person= line.split(" ");         //метод split разделяет строку на подстроки
                if(Integer.parseInt(person[1])<0){              //nextLine()- считывает и возвращает строку
                    throw new IllegalArgumentException();
                }
            }
            System.out.println(people);

        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

    public static List<Person> parseFileToObjList(){
        File file = new File("people.txt");
        try {
            Scanner scanner = new Scanner(file);
            List<Person> people = new ArrayList<>();
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] strings =line.split(" ");
                if(Integer.parseInt(strings[1])<0){
                    throw new IllegalArgumentException();
                }
                Person person = new Person(strings[0], Integer.parseInt(strings[1]));
                people.add(person);
            }
            System.out.println(people);
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
