package JavaPrecticeMiddle.JavaCollections.Set;

import java.util.*;

public class Sets {
    public static void main(String[] args){
        //set - коллекция, которая хранит в себе уникальные элементы, т.е. нет одинаковых элементов
        Set<Integer> hashSet = new HashSet<>();                    //не гарантируется порядок
        Set<Integer> hashSet1 = new HashSet<>();                    //не гарантируется порядок
        Set<String> linkedHashSet = new LinkedHashSet<>();        //гарантируется порядок добавления, в таком порядке они и вернутся
        Set<String> treeSet = new TreeSet<>();                    //объекты отсортируются по порядку

//        hashSet.add("Mike");
//        hashSet.add("Katy");
//        hashSet.add("Tom");
//        hashSet.add("George");
//        hashSet.add("Donald");

//        linkedHashSet.add("Mike");
//        linkedHashSet.add("Katy");
//        linkedHashSet.add("Tom");
//        linkedHashSet.add("George");
//        linkedHashSet.add("Donald");

//        hashSet.add("Mike");
//        hashSet.add("Katy");
//        hashSet.add("Tom");
//        hashSet.add("George");
//        hashSet.add("Donald");

        //в сетах метод contains работает очень быстро из-за хэширования, в отличие от List, в котором для этого приходится перебирать каждый элемент
//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.contains("Tim"));
//
//        System.out.println(hashSet.isEmpty());

//        for(String set: treeSet){
//            System.out.println(set);
//        }

        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);
        hashSet1.add(6);
        hashSet1.add(7);

        //union - объеденение множеств
        Set<Integer> union = new HashSet<>(hashSet);        //создали сет, в котором будем хранить результаты
        union.addAll(hashSet1);
        System.out.println(union);

        //intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(hashSet1);                      //retain - сохрани/оставь, т.е. оставляет те элементы, которые есть в обоих множествах
        System.out.println(intersection);

        //difference - разность множеств
        Set<Integer> difference = new HashSet<>(hashSet);
        difference.removeAll(hashSet1);                        //remove - удаляет все элементы из difference, которые есть в hashSet1
        System.out.println(difference);

        //HashSet реализует интерфейс HashMap. В HashSet и есть данные из HashMap(т.е. пара ключ-значение), но с отсеченной частью значение, т.е. можно сказать,
        //что в HashSet'e хранятся только ключи из HashMap'a
    }
}
