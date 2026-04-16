package Задачи.TaskForTraining;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class T5 {
    /*
    Добавить в List<> объекты Кошка, Кошка, Собака, Медведь. Написать метод по удалению дубликатов из листа.
    (Решение со стримом и без)
     */

    /*
    filter() отбирает элементы по условию (предикату), оставляя только те, которые его проходят
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0) // Оставляет только четные
                                   .collect(Collectors.toList());
     */

    /*
    map() преобразует каждый элемент потока в новый, применяя к нему функцию, но сохраняя количество элементов
    List<String> words = Arrays.asList("apple", "banana", "cherry");
    List<Integer> lengths = words.stream()
                             .map(String::length) // Преобразует String в Integer (длину)
                             .collect(Collectors.toList());

     */

    public static void main(String[] args){
        //Создаем изменяемый список ArrayList
        List<String> list=new ArrayList<>();
        list.add("Кошка");
        list.add("Кошка");
        list.add("Собака");
        list.add("Медведь");

        System.out.println(noDuplicate(list));
        System.out.println(noDuplicate1(list));

                                       //Реализация через StreamAPI №1
        Stream stream = list.stream();
        System.out.println(stream.distinct().collect(Collectors.toList()));


                                       //Реализация через StreamAPI чуть по-другому
        //Создаем неизменямый список
        List<String> list1 = List.of("Кошка", "Кошка", "Собака", "Медведь");


        //Создаем новый список, куда будем складывать уникальные значения из list1
        List<String> listNoDuplicate = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(listNoDuplicate);

                                       //Реализация через StreamAPI №2
        List<String> list2 = List.of("Кошка", "Кошка", "Собака", "Медведь");
        Set<String> set = new HashSet<>();
        List<String> listNoDuplicate1= list2.stream().filter(x-> set.add(x)).collect(Collectors.toList());
        System.out.println(listNoDuplicate1);
    }

    public static List<String> noDuplicate(List<String> list){
        List<String> list1 = new ArrayList<>();
        for(String l:list){
            if(!list1.contains(l)){
                list1.add(l);
            }
        }
        return list1;
    }


    public static Set<String> noDuplicate1(List<String> list){
        Set<String> set= new HashSet<>(list);
        return set;
    }


}
