package JavaPrecticeMiddle.JavaCollections.HashCodeAndEquals;

import java.util.*;

public class hashCodeAndEquals {
    public static void main(String[] args){
        //уникальность элементов в map'ах и set'ах достигается при помощи проверки на идентичность
        //проверки на идентичность осуществляются при помощи контракта hashCode() equals()
        //Пример
        //Сначала добавим уникальные объекты в map и set
        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(2, "Katy");
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();
        map.put(person1, "123");
        map.put(person2, "123");
        set.add(person1);
        set.add(person2);
        System.out.println(map);
        System.out.println(set);

        //Теперь изменим второго человека так, чтобы он был неотличим от первого, т.е. по сути один и тот же человек
        Person person3 = new Person(1, "Mike");
        Person person4 = new Person(1, "Mike");
        Map<Person, String> map1 = new HashMap<>();
        Set<Person> set1 = new HashSet<>();
        map1.put(person3, "123");
        map1.put(person4, "123");
        set1.add(person3);
        set1.add(person4);
        //перед этим закоммить методы  hashCode и equals в классе Person
        System.out.println(map1);
        System.out.println(set1);
        //в консоль все равно вывелись все объекты, даже не смотря на то, что set и map обеспечивают уникальность объектов
        //это происходит потому, что для джавы person1/2/3/4 - это уникальные объекты, set и map не лезут внутрь класса
        //person и не проверяют, что поля id и name могут быть одинаковыми, они видят только то, что это разные объекты
        // методы hashCode и equals созданы для того, чтобы решить эту проблему

        //если мы просто будем добавлять одинаковые строки, то уникальность сохранится
        //это происходит потому, что String реализует методы hashCode и equals
        //чтобы это работало в классе Person,нужно в нем переопределить методы hashCode и equals (по умолчанию наследуется от класса Object и сравнивает объекты как участки памяти)
        //после переопределения этих методов будет достигнута уникальность объектов
    }
}

class Person{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
