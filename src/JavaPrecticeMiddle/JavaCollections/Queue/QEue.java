package JavaPrecticeMiddle.JavaCollections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QEue {
    public static void main(String[] args){
        //queue(от англ.) - очередь. Это коллекция, элементы в которой будут доставаться в том же порядке, в каком их туда положили, т.е. первый зашел - первый вышел
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);
        //есть 2 метода для добавления элементов в очередь: add и offer
        //add - в случае ошибки выбрасывает исключение, offer - в случае ошибки выбрасывает значение (true/false)

        //есть 2 метода для получения элемента из очереди: remove и poll
        //для  remove и poll действует та же логика, что и для add/offer с выбрасыванием исключения/значения
        Queue<Person> people = new LinkedList<>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);
        //Очередь: person3 -> person2 -> person4 -> person1
        //System.out.println(people);
        for(Person person: people){
            System.out.println(person);
        }
        //Другая реализация queue - ArrayBlockingQueue. В отличие от LinkedList, где очередь может быть бесконечной(в зависимости от места на жестком диске),
        //в аргументах ArrayBlockingQueue можно задать размер очереди. Если Queue<Person> people1 = new ArrayBlockingQueue<>(10); - то в нашей очереди будет
        //10 объектов и добавить больше мы не сможем

        //метод remove - удаляет 1-й элемент из очереди
        System.out.println();
        System.out.println(people.remove());
        System.out.println(people);

        //метод peek - позволяет посмотреть на 1-й элемент в очереди, при этом не удаляя его
        System.out.println();
        System.out.println(people.peek());
        System.out.println(people);
    }
}

class Person{
    private int id;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    public Person(int id) {
        this.id = id;
    }
}
