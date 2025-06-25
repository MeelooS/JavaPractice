package JavaPrecticeMiddle.РегулярныеВыражения;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        //позволяют работать со строками
        /*
        В регулярных выражениях спец. символы обознач-ся 2-мя //
        \\d - одна цифра
        \\w - одна буква       (\\w+ = [a-zA-Z])
        Пример:
        Если String abc = "123";
        System.out.println(abc.matches("\\d")); - будет false, т.к. мы сравниваем цифру \\d с числом(НЕ С ЦИФРОЙ!), в случае если abc = 1, то будет true

        Если мы хотим дать понять, что сравниваем число, то используем:
        + - 1 или более
        * - 0 или более
        Пример:
        Если String abc = "123";
        System.out.println(abc.matches("\\d+")); - будет true, т.к. описываем строку с 1 или более цифр
        * выдаст true даже на пустой строке, т.к. ждем 0 или более

        Для сравнения отриц. чисел ставят минус перед -\\d

        Если хотим сравнивать и полож., и отриц. числа, то используем: ? - символ, который используем до него может быть, а может не быть (0 или 1 символов до)
        Пример:
        Если String abc = "123";
        System.out.println(abc.matches("-?\\d+")); - будет true, - минус может быть, а может и не быть
        Если String abc = "+123"; - будет false, т.к. + не ждем, а ждем -

        Для того, чтобы ждать и -, и +, используют ():
        () - описывают разные вероятности
        Пример:
        Если String abc = "+123";
        System.out.println(abc.matches("(-|\\+)?\\d+")); - будет true, - ждем как +, так и - (перед + пишем \\ т.к. джава думает, что + это спец. символ, и чтобы она так не думала нужны \\

        Что делать если перед числом/цифрой стоит буква (всегда англ. алфавита!)? Можно было бы описать ее в (): (q|-|\\+), но можно использовать и []:
        [] - описывает множества вероятностей. Например, если хотим в вероятность добавить весь англ. алфавит, то получится следующее:
        [a-zAa-z] - если ждем одну букву,
        [a-zAa-z]+ - если ждем 1 или более букв,
        [a-zAa-z31]+ - если среди букв будут цифры 3 или 1 (asdafaf3asf1), т.е. до набора цифр могут быть буквы или цифры 1 и 3 с буквами
        [abc] = (a|b|c)

        Если разрешены все символы, кроме a,b и c, то используют ^ (отрицание)
        [^abc] или [^a-c]

        Если нужно предположить все, что угодно, то исп. .
        . - все, что угодно, любой символ
        Пример:
        String url = "https://www.google.com";
        System.out.println(url.matches("https://www\\..+"));  .+ означает, что на месте названия сайта может быть абсолютно любой набор символов

        Если нужно указать точное кол-во знаков до, а не любое как с * или +, то исп. {}
        {2} - 2 символа до            (//d{2})
        Пример:
        String f = "123";
        System.out.println(f.matches("\\d{3}")); - true
        {2,} - 2 или более символов   (//d{2,})
        Пример:
        String f = "123";
        System.out.println(f.matches("\\d{2,}")); - true
        {2,4} - от 2 до 4 символов    (//d{2,4})
         */


                                                          //некоторые методы:
        //matches() - вызывается у объектов класса String, сравнивает строку, которую передали в качестве аргумента, со строкой у которой был вызван
        //принимает на вход не только строку< но и регулярные выражения
        String a = "qwe";
        System.out.println(a.matches("qwe"));
        String abc = "1";
        System.out.println(abc.matches("\\d"));
        String ab = "3";
        System.out.println(ab.matches("\\d+"));
        String b = "";
        System.out.println(b.matches("\\d*"));
        String c = "-12";
        System.out.println(c.matches("-\\d*"));
        String q = "-12";
        System.out.println(q.matches("-?\\d+"));
        String w = "+123";
        System.out.println(w.matches("(-|\\+)?\\d+"));
        String e = "qw-123";
        System.out.println(e.matches("[a-z]+(-|\\+)?\\d+"));
        String qw = "hello";
        System.out.println(qw.matches("[^a-c]+"));
        System.out.println(qw.matches("[^abc]+"));
        String qe = "asdasdbdac";
        System.out.println(qe.matches("[^a-c]+"));
        System.out.println(qe.matches("[^abc]+"));
        String url = "https://www.google.com";
        System.out.println(url.matches("https://www\\..+(com|ru)"));
        String f = "123";
        System.out.println(f.matches("\\d{2,}"));  //хотим чтобы в нашей строке было всего 2 символа - будет false, если будет {3} - будет true
        String fe = "qwe";
        System.out.println(fe.matches("\\w+"));

        //split - разделяет строку, на которой был вызван, на что-то, указанное в аргументе (можно получать массив строк из одной строки)
        String asd = "Hello there hey";
        String[] words = asd.split(" ");
        System.out.println(Arrays.toString(words));     //Arrays.toString() - используется при массиве
        String as = "Hello.there.hey";
        String[] word = as.split("\\.");
        System.out.println(Arrays.toString(word));
        String asw = "Hello123there123hey";
        String[] wordw = asw.split("\\d+");
        System.out.println(Arrays.toString(wordw));

        //replace - позволяет заменить что-то в строке на что-то другое
        //replace принимает на вход только одну строку, а не массив!
        String asdw = "Hello there hey";
        String wordsw = asdw.replace(" ", ".");
        System.out.println(wordsw);
        //replaceAll - принимает на вход регулярные выражения
        String asww = "Hello123there123hey";
        String wordsww = asww.replaceAll("\\d+", ".");
        System.out.println(wordsww);
        //replaceFirst - разделяет только 1-й знак
        String aswww = "Hello123there123hey";
        String wordswww = aswww.replaceFirst("\\d+", ".");
        System.out.println(wordswww);
    }
}
