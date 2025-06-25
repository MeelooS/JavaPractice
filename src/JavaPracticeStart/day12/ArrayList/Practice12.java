package JavaPracticeStart.day12.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice12 {
    public static void main(String[] args){
        //1.Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль. Добавить в середину еще
        //1 автомобиль, удалить самый первый автомобиль из списка. Распечатать список.
        System.out.println("Задание 1");
        List<String> spisokAuto = new ArrayList<>();
        spisokAuto.add("Aidi");
        spisokAuto.add("Ford");
        spisokAuto.add("Chevrolet ");
        spisokAuto.add("BMW");
        spisokAuto.add("Ferrari");
        System.out.println(spisokAuto);

        spisokAuto.remove(0);
        System.out.println(spisokAuto);
        spisokAuto.add(2,"UAZ");
        System.out.println(spisokAuto);

        //2.Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
        System.out.println();
        System.out.println("Задание 2");
        List<Integer> numbers = new ArrayList<>();
        for(int i =0; i<=30;i++){
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        for (int i =300; i<=350; i++){
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        //3.*Выполнять в подпапке task3 в JavaPracticeStart.day12*
        //Создать класс Музыкальная Группа (MusicBand) с полями name и year (название музыкальной группы и год
        //основания). Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие
        //музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать список.
        //Создать статический метод в классе Task3: public static List<MusicBand> groupsAfter2000(List<MusicBand>
        //bands). Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
        //основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем
        //списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
        System.out.println();
        System.out.println("Задание 3");
        System.out.println("Реализовано в подпапке task3 в JavaPracticeStart.day12,  в классе Practice12");

        //4.*Выполнять в подпапке task4 в JavaPracticeStart.day12*
        //Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и
        //удалять участников. Под участником понимается строка (String) с именем и фамилией. Реализовать статический
        //метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода:
        //transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. Реализовать метод
        //printMembers (в классе MusicBand), выводящий список участников в консоль. Проверить состав групп после
        //слияния.
        System.out.println();
        System.out.println("Задание 4");
        System.out.println("Реализовано в подпапке task4 в JavaPracticeStart.day12,  в классе Practice12");

        //5.*Выполнять в подпапке task5 в JavaPracticeStart.day12*
        //Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только
        //имя, но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
        //Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
        //чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось в
        //4 задании - слить две группы и проверить состав групп после слияния. Методы для слияния и для вывода
        //участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Реализовано в подпапке task5 в JavaPracticeStart.day12,  в классе Practice12");
    }
}
