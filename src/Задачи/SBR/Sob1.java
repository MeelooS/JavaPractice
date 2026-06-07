package Задачи.SBR;

public class Sob1 {
    public static void main(String[] args){

        System.out.println(repeatWord("Java", "И", 3));
        System.out.println(repeatWord("Java", "И", 2));
        System.out.println(repeatWord("Java", "И", 1));
        System.out.println(repeatWord("Java", "И", 0));

    }
    /*Написать функцию, которая принимает на вход строку word, строку separator и число count.
    Результат должен возвращать строку, содержащую word в количестве count, разделённых separator

    ("Тест", "О", 3) → "ТестОТестОТест"
    ("Java", "И", 2) → "JavaИJava"
    ("Java", "И", 1) → "Java"
    ("Java", "И", 0) → ""
     */

    public static String repeatWord(String word, String separator, int count){
        String a="";
        if (count==0){
            return "";
        }
        for (int i=0; i<count; i++){
            if(i<count-1){
                a+=word+separator;
            } else {
                a+=word;
            }
        }
        return a;
    }

    public static String repeatWord1(String word, String separator, int count) {
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
