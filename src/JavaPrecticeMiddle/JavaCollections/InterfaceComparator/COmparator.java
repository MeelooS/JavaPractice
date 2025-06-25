package JavaPrecticeMiddle.JavaCollections.InterfaceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class COmparator {
    public static void main(String[] args){
        //сортировка элементов внутри java-коллекций
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        Collections.sort(animals);          //sort - статич. метод в классе Collections, сортирует элементы по естественному порядку
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);
        Collections.sort(numbers);
        System.out.println(numbers);

        //когда не устраивает естественная сортировка используют интерфейс Comparator
        //для этого нужно создать новый класс и реализовать его от интерфейса Comparator

        //теперь когда класс готов, то теперь в аргументы метода sort можно записать новый объект нового класса
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);      //сортировка происходит так: в новом классе возвращается либо -1, либо 0, либо 1. В начале сначала записываются -1, потом 0 , и в конце 1,
                                          // т.е. если при сравнении двух строк получилось -1, то меньшая строка запишется в начало, а если в рез-те сравнения вернулась 1,
                                          //то большая строка запишется в конце

        //соответсвенно, если нужно отсортировать числа в порядке убывания, то нужно сделать все то же самое, но поменять значения return'ов местами
        Collections.sort(numbers, new NumberComparator());
        System.out.println(numbers);

        //для одной лишь сортировки создавать новый класс нецелесообразно, поэтому используют анонимный класс:
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                } else if (o1<o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);

        //такая конструкция возможна лишь потому, что у чисел и строк есть свой естественный порядок, у объектов же его нет
        //мы не можем просто указать объект в качестве аргумента для метода sort (Collections.sort(people)) как делали до этого, поэтому приходится делать так:
        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "John"));
        people.add(new Person(1, "Bob"));
        people.add(new Person(2, "KATY"));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.id>o2.id){
                    return 1;
                } else if (o1.id<o2.id) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        //у метода compare есть конвенция
        //если o1>o2 , то return 1;
        //если o1<o2 , то return -1;
        //если o1=o2 , то return 0;
        if(o1.length()>o2.length()){
            return 1;
        } else if (o1.length()<o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class NumberComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        //у метода compare есть конвенция
        //если o1>o2 , то return 1;
        //если o1<o2 , то return -1;
        //если o1=o2 , то return 0;
        if(o1>o2){
            return -1;
        } else if (o1<o2) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
