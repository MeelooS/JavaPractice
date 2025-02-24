package JavaPrecticeMiddle.РегулярныеВыражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatchesClasses {
    public static void main(String[] args){
        /*
        класс Pattern - само регулярное выражение
        класс Matcher исп-ет класс Pattern, чтобы проводить операции над текстом
        Самая распр-я ф-я - поиск совпадений(паттерна) в тексте
         */
        String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's so cool! I'm sending you\n" +
                "my address: tim@yandex.ru. Let's stay in touch...";
        Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)");         //не можем создавать объект напрямую, т.к. у него есть конструктор
        //теперь реализуем сущность, которая будет работать с текстом
        Matcher matcher = email.matcher(text);            //Вызываем на нашем паттерне, т.е. получаем matcher на основании нашего паттерна. В аргументах записываем строку, с которой будем работать

        while (matcher.find()){                           //find - возвращает true если нашелся текст, подходящий паттерну, иначе false
            System.out.println(matcher.group());          //group - возвращает то, что было найдено matcher
        }


        /*
        В группу в качестве аргумента можем передавать цифры. Что такое группа?
        Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)");
        @(gmail|yandex) - группа(под скобками)
        (com|ru) - группа(под скобками)
        у каждой группы есть свой уникальный id

        Если мы хотим получить на выходе не целый почтовый адрес, а только первые буквы до @, нужно:
        Во-первых: заключить эти буквы в группу, т.е. взять в скобки:
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Во-вторых: передать эту группу в аргументе метода group:
        while (matcher.find()){
            System.out.println(matcher.group(1));
        }

         */

        Pattern email1 = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher1 = email1.matcher(text);
        while (matcher1.find()){
            System.out.println(matcher1.group(1));
        }
    }
}
