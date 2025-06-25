package JavaPracticeStart.day1;

public class Practice1 {
    public static void main(String[] args){
        //1.Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while:
        System.out.println("Задание 1");
        int s = 0;
        while(s<10){
            System.out.print("JAVA ");
            s = s+1;
        }

        //2.Повторить задание 1, но используя цикл for:
        System.out.println();
        System.out.println("\n Задание 2");
        for(int s1=0; s1<10; s1++){
            System.out.print("JAVA ");
        }

        //3.Вывести на экран слово “JAVA”, в столбик, чтобы оно повторилось 10 раз,используя цикл на ваше усмотрение for
        // или while.
        System.out.println();
        System.out.println("\n Задание 3");
        for(int s1=0; s1<10; s1++){
            System.out.println("JAVA ");
        }

        //4.Объявите переменную типа int, имя переменной - year. Присвойте этой переменной значение 1980. Используя цикл
        // while, выведите в столбик строки вида “Олимпиада X года”, где X - это число, которое принимает значения,
        // начиная от 1980 до 2020 с шагом увеличения равным 4.
        System.out.println("\n Задание 4");
        int year =1980;
        while(year<=2020){
            System.out.println("Олимпиада "+year+" года");
            year = year +4;
        }

        //5.Повторить задание 4, но используя цикл for.
        System.out.println("\n Задание 5");
        for (int year1=1980; year1<=2020; year1=year1+4){
            System.out.println("Олимпиада "+year1+" года");
        }

        //6.Объявите переменную типа int, имя переменной - k. Присвойте этой переменной какую-нибудь цифру от 1 до 9.
        // Используя цикл на ваше усмотрение (for или while), выведите в консоль таблицу умножения для этой цифры
        //P.s. решил использовать оба, чтобы проверить себя
        System.out.println("\n Задание 6");
        System.out.println("\n С циклом for");
        int k =2;
        for(int i=1;i<=9;i++){
            System.out.println(k + " x " + i + " = " + i*k);
        }

        System.out.println("\n С циклом while");
        int i1=1;
        while(i1<=9){
            System.out.println(k + " x " + i1 + " = " + i1*k);
            i1++;
        }
    }
}
