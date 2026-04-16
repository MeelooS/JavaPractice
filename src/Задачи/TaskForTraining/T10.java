package Задачи.TaskForTraining;

public class T10 {
    /*
    Даны две переменных int. Поменять их значения не используя третью переменную
    То же самое, но со строкой
     */
    public static void main(String[] args){
//        QQQ("ab","BC");
    }

    public static void reverse(int a, int b){
        a+=b;
        b=a-b;
        a-=b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void stringReverse(String a, String b){
        a=a+b;
        b=a.substring(0, a.length()-b.length());
        a=a.substring(a.length()-b.length(), a.length());
        System.out.println(a);
        System.out.println(b);

    }
}