package JavaPracticeStart.day8.StringBuilderИToString;

public class Practice8 {
    public static void main(String[] args){
        //1.Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная
        // конкатенацией (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + ... + 20000).
        //После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все
        // числа из диапазона:
        //0 1 2 3 4 5 6 7 8 9 10 11 12 ... 19995 19996 19997 19998 19999 20000
        //Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String) и
        // использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы
        // программы.
        System.out.println("Задание 1");
        String string = "";
        long tms = System.currentTimeMillis();
        for(int i=0; i<=20000; i++){
            string = string+i+" ";
        }
        System.out.println(string);
        long tms1 = System.currentTimeMillis();
        System.out.println("Время выполнения программы составило: "+(tms1-tms));
        System.out.println();
        System.out.println("Реализуем то же самое со StringBuilder:");
        StringBuilder str = new StringBuilder();
        long tms2 = System.currentTimeMillis();
        for(int i=0; i<=20000; i++){
            str=str.append(i).append(" ");
        }
        System.out.print(str);
        long tms3 = System.currentTimeMillis();
        System.out.println("Время выполнения программы составило: "+(tms3-tms2));

        //2.Скопируйте класс Самолет из задания дня 6. Внесите изменения в класс таким образом, чтобы следующий код
        // выводил информацию о самолете, аналогично вызову метода info().
        //Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
        //System.out.println(airplane);
        System.out.println();
        System.out.println("Задание 2");
        Airplane airplane = new Airplane("British Aerospace", 2010, 29, 45);
        System.out.println(airplane);
    }
}
