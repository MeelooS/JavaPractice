package JavaPrecticeMiddle.JavaCollections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args){
        // Map(от англ.) - отображение. Отображение - сопоставление элементов одного множества к элементам другого множества
        // Пример:
        // класс  множество учеников
        //   1 = [.................]     1-мно-во классов(ключи), а ученики - это значения ключей
        //   2 = [.................]
        Map<Integer, String> map = new HashMap<>();             //под <> должны указать ключи и их значения
        //числа в качестве ключа, а его значения - это строки
        map.put(1, "Один");             //put - добавляет ключ-значение в map
        map.put(2, "Два");
        map.put(3, "Три");
        //HashMap не гарантирует порядок вложенных в него пар ключ-значений, при каждом запуске программы порядок может быть разным
        System.out.println(map);
        map.put(3, "Тройка");           //значение ключа 3 переписывается
        System.out.println(map);
        System.out.println(map.get(1));         //для получения значения конкретного ключа, указываем нужный ключ

        for(Map.Entry<Integer, String> entry : map.entrySet()){                //Entry - каждая пара ключ-значение
            System.out.println(entry.getKey()+":"+ entry.getValue());          //entrySet - возвращает набор всех пар ключ-значение нашей map
            //        getKey - получает ключ      getValue - получает значение ключа
        }

        //HashSet реализует интерфейс HashMap. В HashSet и есть данные из HashMap(т.е. пара ключ-значение), но с отсеченной частью значение, т.е. можно сказать,
        //что в HashSet'e хранятся только ключи из HashMap'a

        //Map - массив из LinkedList'ов
    }

}
