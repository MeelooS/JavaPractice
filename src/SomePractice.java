import day13.User;

import java.util.Scanner;

public class SomePractice {
    public static void main(String[] args){
        System.out.println("Hello Java!");


        //ПЕРЕМЕННЫЕ

        int s; //Декларация переменной
        s=25; //Инициализация переменной
        int s1=26; //Декларация и инициализаааация переменной в одной строчке

        //РАЗЛИЧНЫЕ ТИПЫ ПЕРЕМЕННЫХ
        //Примитивные
        int myInt = 2000000; //содержит в себе 32-битные числа, т.е. приблизительно от -2 000 000 000 до 2 000 000 000
        short myShort = -32000; //содержит в себе 16-битные числа, т.е. от -32000 до 32000
        long myLong = 123;//содержит в себе 64-битные числа, т.е. квинтиллионы
        double myDouble = 12.36; //содержит дробные числа
        float myFloat = 12.36f; //также содержит дробные числа, но т.к. в джаве все дробные числа по умолчанию типа double, то чтобы дать знать программе, что нужно использовать float, в конце добавляем f
        char myChar = 'a' ; //содержит в себе какой-то символ
        boolean myBoolean = true; //содержит в себе логическое выражение
        byte myByte = -128;//содержит в себе 8 битов информации, т.е. 1 байт = от -128 до 127
        //Ссылочные
        String string = "abc"; //в отличие от char используются двойные кавычки

        //Оператор for each
//        public boolean isSubscribed(User user){                         //сравнивает все имена из списка subscription c именем, поступившего в качестве аргумента
//            for (User user1: subscriptions){                            //перебираем каждый i-й элемент(user1) из списка subscription
//                if(user1.getUsername().equals(user.getUsername())){
//                    return true;
//                }
//            }
//            return false;
//        }

        //Пример использования переменной Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ваш ввод в консоль: ");
//        double a = scanner.nextDouble();                                //nextLine/Int/Double - считывает и возвращает данные


        //Пример обычного массива
//        int[] massive1 = new int[100];                             //[100]-размер, []-обычный массив, [][]-двумерный массив
//        for(int i=0; i< massive1.length; i++){
//            massive1[i]= random.nextInt(10000);
//        }

        //Пример двумерного массива
//        int[][] matrix = new int[12][8];                     //[12]-кол-во строк, [8]-кол-во колонок
//        for (int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[i].length; j++){
//                matrix[i][j]= random.nextInt(50);
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }


    }
}