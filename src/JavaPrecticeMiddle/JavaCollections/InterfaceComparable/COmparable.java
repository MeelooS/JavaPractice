package JavaPrecticeMiddle.JavaCollections.InterfaceComparable;

import java.util.*;

public class COmparable {
    public static void main(String[] args){
        //у объектов нет собственного порядка< поэтому нельзя использовать метод sort
        //тогда зададим естественный порядок нашим объектам
        List<Person> peopleList =  new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        System.out.println(peopleList);
        System.out.println(peopleSet);

        //возникла ошибка, т.к. TreeSet хочет отсортировать все в себе по естественному порядку самого объекта, а в классе Person не указана сортировка
        //для того чтобы ее указать, нужно в классе Person реализовать интерфейс Comparable, который дает понять, что два объекта могут сравниваться между собой
        //теперь убедимся, что сортировка работает как надо:
        Collections.sort(peopleList);
        System.out.println(peopleList);

        //метод sort не вызывается у TreeSet, т.к. TreeSet сама сортирует по естественному порядку
    }

    private static void addElements(Collection collection){
        collection.add(new Person(4, "George"));
        collection.add(new Person(1, "bOB"));
        collection.add(new Person(3, "Katy"));
        collection.add(new Person(2, "Tom"));
    }
}

//class Person{
//    int id;
//    String name;
//
//    public Person(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

class Person implements Comparable<Person>{
    @Override
    public int compareTo(Person o) {
        if(this.id > o.id){                       //this - текущий объект класаа Person
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }

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
