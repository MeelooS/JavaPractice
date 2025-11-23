package Задачи;

public class Task7 {
    /*
    На вход подается 2 пременные a и b (могут быть int и String)
    Реализовать метод, который поменяет их местами
     */
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
