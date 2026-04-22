package Задачи.SBR;

public class Task7 {
    public static void main(String[] args){
        /*
          На вход подается 2 пременные a и b (могут быть int и String)
          Реализовать метод, который поменяет их местами
        */

        /*
        substring(): возвращает новую подстроку, начиная с указанного начального индекса и заканчивая указанным
        конечным индексом (не включая его), либо от начального индекса и до конца строки
        */

        reverese(7,5);
        System.out.println();
        reverse1("af","zx");

    }


    public static void reverese(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a+",");
        System.out.print(b);
    }

    public static void reverse1(String str, String str1){
        str=str+str1;
        str1=str.substring(0,(str.length()-str1.length()));
        str=str.substring(str1.length());
        System.out.println(str+","+str1);
    }
    public static void reverseVariable(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+","+b);
    }

    public static void reverseVariable1(String a, String b){
        a=a+b;
        b=a.substring(0, a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+","+b);
    }
}
