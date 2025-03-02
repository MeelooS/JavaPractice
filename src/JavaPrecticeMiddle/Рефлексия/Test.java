package JavaPrecticeMiddle.Рефлексия;

public class Test {
    public static void main(String[] args){
        /*
        Все классы, которые мы создаем в Java (и встроенные классы тоже) можно рассматривать как объекты (экземпляры) класса Class
        Значит все инмтрументы ООП мы можем применить к самим классам как к сущностям (рассматриваем класс как объект класса Class и работает с ним как с обычным объектом в Java). Это и есть рефлексия.
        Объекты класса Class - это конкретные классы, со своим называнием, методами, полями

        Например, рассмотрим clas Teacher (JavaPracticeStart->day6). Здесь:
        Конкретный человек(учитель) - это экземпляр (объект) класса Teacher (со своим именем, предметом преподавания и т.д.)
        Класс Teacher - это экземпляр (объект) класса Class

        Класс Class - служебный класс, экземпляры которого(Java классы) хранят конкретную инф-ю о конкретном классе

                                         Как получить доступ к объекту класса Class? (получить доступ = воспринимать какой-то класс как объект класса Class)
        1)По классу: (пусть это Teacher)
        Class c = Teacher.class;
        2)По объекту: (пусть teacher - экземпляр класса Teacher: Teacher teacher = new Teacher();)
        Class c = teacher.getClass();
        3)По названию класса: (пусть полное имя класса = "Teacher");
        Class c = Class.forName("Teacher");

        Method - это тоже класс. Методы, которые мы добавялем в классе - это экземпляры(объекты) класса Method
        Class personClass = Teacher.class;   //класс Teacher воспринимаем как объект класса Class и работаем с ним как с объектом, т.е. вызываем на нем методы, которые возвращают методы класса Teacher, его поля и аннотации
        Method[] methods = Teacher.getMethods();
        Field - это тоже класс. Поля, которые мы добавялем в классе - это экземпляры(объекты) класса Field
        Class personClass = Teacher.class;
        Field[] fields = Teacher.getFields();
        getFields() - получает доступ только к публичным полям (из-за инкапсуляции);
        getDeclaredFields() - получает доступ ко всем полям

                                                                  Для объекта класса Class можно:
         1)Создавать новые объекты при помощи метода newInstance(), по умолчанию создается с пустым конструктором; (равнозначно созданию нового объекта через ключ. слово new)
         2)Получать методы по сигнатуре getMethod(). Чтобы получить метод, нужно в параметрах указать его название и тип принимаемых параметров;
         Class stringClass = String.class;
         Method m = stringClass.getMethod(
                  name:"IndexOf",
                  String.class, int.class);

         3)Получать конструкторы по сигнатуре getConstructor();

                                                                    Для объекта класса Method:
         Вызывать методы через invoke();
         */
    }
}
