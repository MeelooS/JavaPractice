package day9;

public class Practice9 {
    public static void main(String[] args){
        //1.Создайте класс Человек (Human). У человека должно быть поле “имя” (name).На это поле в классе должен быть
        // конструктор, get и set методы. Также, у Человека должен быть метод printInfo(), который выводит в консоль
        // информацию о человеке в формате: “Этот человек с именем ИМЯ”.Затем, создайте класс Студент (Student), который
        // наследуется от класса Человек. У студента есть дополнительное строковое поле - название его учебной группы.
        // Для этого поля тоже необходимо создать геттер и сеттер. Конструктор в классе Студент должен принимать на вход
        // два аргумента - имя и название учебной группы. Метод printInfo() в классе Студент должен быть переопределен
        // таким образом, чтобы формат выводимого в консоль сообщения был таким:
        //“Этот человек с именем ИМЯ”
        //“Этот студент с именем ИМЯ”
        //(должно выводиться именно две строки - необходимо использовать ключевое слово super)
        //И наконец, в нашей программе должна быть еще одна сущность - Преподаватель (Teacher). Преподаватель должен
        // тоже наследоваться от класса Человек. При этом, у преподавателя есть дополнительное строковое поле - название
        // предмета, который ведет этот преподаватель. Для этого поля необходимо создать get и set методы. Конструктор в
        // классе Преподаватель должен принимать на вход два аргумента - имя преподавателя и название преподаваемого
        // предмета. Метод printInfo() в классе Преподаватель должен быть переопределен таким образом, чтобы формат
        // выводимого в консоль сообщения был таким:
        // “Этот человек с именем ИМЯ”
        //“Этот преподаватель с именем ИМЯ”.
        //(должно выводиться именно две строки - необходимо использовать ключевое слово super)
        //Создайте в методе main() класса Task1 объект класса Студент и объект класса Преподаватель. Выведите в консоль
        // название учебной группы у объекта-студента и название предмета у объекта-преподавателя. Затем, вызовите
        // printInfo() на объектах и посмотрите на результат.
        System.out.println("Задание 1");
        Human human = new Human("Bob");
        Student student = new Student("Jack", "RBD");
        Teacher teacher = new Teacher("John", "Math");
        System.out.println("Студент:");
        student.printInfo();
        System.out.println();
        System.out.println("Учитель:");
        teacher.printInfo();
        System.out.println();
        System.out.println(student.getNameOfStudyGroup());
        System.out.println(teacher.getNameOfLesson());

        //2.Создайте абстрактный класс Фигура (Figure). Этот класс будет являться абстрактным представлением
        //геометрической фигуры в нашей программе. У всех фигур в нашей программе есть цвет, поэтому в классе Фигура
        //есть строковое поле color. Создайте конструктор, геттер и сеттер для этого поля. У класса Фигура определены
        //два абстрактных метода:
        //public abstract double area();
        //public abstract double perimeter();
        //Реализация первого метода должна возвращать площадь фигуры, а реализация второго метода должна возвращать
        //периметр фигуры.
        //Создайте 3 геометрические фигуры: Круг (Circle), Прямоугольник (Rectangle) и Треугольник (Triangle). Каждая из
        //фигур должна наследоваться от абстрактного класса Фигура (Figure).
        //У класса Круг будет одно поле - радиус окружности.
        //У класса Прямоугольник будет два поля - ширина и высота.
        //У класса Треугольник будет три поля - длина каждой из сторон.
        //Для каждого из этих трех классов необходимо реализовать конструктор, который принимает на вход размерности
        //фигуры и цвет фигуры. В этих же классах, вам необходимо реализовать два метода (area() и perimeter()).
        //Реализация этих методов будет разной для каждой из геометрических фигур. Формулы для вычисления площади и
        //периметра легко находятся в интернете. После того, как геометрические фигуры будут полностью реализованы, вам
        //необходимо будет реализовать еще один класс - TestFigures. В этом классе, в методе main() должны быть созданы
        //и помещены в массив следующие геометрические фигуры:

        //Figure[] figures = {
        //        new Triangle(10, 10, 10, "Red"),
        //        new Triangle(10, 20, 30, "Green"),
        //        new Triangle(10, 20, 15, "Red"),
        //        new Rectangle(5, 10, "Red"),
        //        new Rectangle(40, 15, "Orange"),
        //        new Circle(4, "Red"),
        //        new Circle(10, "Red"),
        //        new Circle(5, "Blue")
        //};

        //В этом же классе реализуйте два метода:
        //public static double calculateRedPerimeter(Figure[] figures)
        //public static double calculateRedArea(Figure[] figures)
        //Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур.
        //Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
        //Вызовите эти два метода на массиве figures и выведите результат в консоль.

//        Реализовано в классе TestFigures
    }
}
