package Задачи;

public class Sob1 {
    public static void main(String[] args){
        System.out.println(repeatWord("Тест", "О", 3)); // "ТестОТестОТест"
        System.out.println(repeatWord("Java", "И", 2)); // "JavaИJava"
        System.out.println(repeatWord("Java", "И", 1)); // "Java"
        System.out.println(repeatWord("Java", "И", 0)); // ""

        System.out.println();
        System.out.println();

        Sob1.raz("Тест", "О", 3);
        Sob1.raz("Java", "И", 2);
        Sob1.raz("Java", "И", 1);
        Sob1.raz("Java", "И", 0);


    }
    /*Написать функцию, которая принимает на вход строку word, строку separator и число count.
    Результат должен возвращать строку, содержащую word в количестве count, разделённых separator

    ("Тест", "О", 3) → "ТестОТестОТест"
    ("Java", "И", 2) → "JavaИJava"
    ("Java", "И", 1) → "Java"
    ("Java", "И", 0) → ""
     */

    public static void raz(String word, String separator, int count) {
        if (count == 0) {
            System.out.println("");
        }
        for (int i = 0; i < count; i++) {
            System.out.print(word);
            if (i < count - 1) {               //если не последний, добавляется separator
                System.out.print(separator);
            }
        }
        System.out.println();
    }

    public static String repeatWord(String word, String separator, int count) {
        if (count == 0) {
            return "\" \"";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i < count - 1) {
                result.append(separator);
            }
        }
        return result.toString();

    }

}
