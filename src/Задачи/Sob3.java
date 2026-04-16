package Задачи;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sob3 {

    public static void main(String[] args){
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(arrayIncreaseNumber(array)));
//        qwe(array);
        increaseByOne(array);
    }
    /*
    Дан массив целых чисел, обозначающих число. Массив не может начинаться с 0.
    Задача: увеличить это число на 1 и вернуть массив чисел

    Примеры:
    Ввод: digits = [1,2,3]
    Вывод: [1,2,4]

    Ввод: digits = [9,9]
    Вывод: [1,0,0]
    */

    public static int[] arrayIncreaseNumber(int[] array) {
        if(array[0]==0){
            System.out.println("Массив не должен начинаться с 0");
            return array;
        }
        String a = "";                                                                      //пустая строка, куда записываем элементы массива

        for (int i = 0; i <= array.length - 1; i++) {                                       //проходим по всем элементам массива, преобразовываем их в String и добавляем в пустую строку:   если array = {1, 2, 3}, то a = "123".
            a = a + String.valueOf(array[i]);
        }

        Integer number = Integer.valueOf(a);                                                //создаем переменную Integer, которая будет ссылаться на нашу строку. Для этого строку переводим в Integer: Например, "123" превращается в число 123.
        number = number + 1;                                                                //123 -> 124

        char[] newNumberSymbols = number.toString().toCharArray();                          //Число 124 превращается в строку "124". Затем делается массив символов: {'1', '2', '4'}.

        int[] resultArray = new int[newNumberSymbols.length];                               //результирующий массив с длиной массива таким же, как и у массива, в котором записаны наши предыдущие числа

        for (int j = 0; j <= resultArray.length - 1; j++) {                                 //цикл на каждой итерации преобразовывает строку в число и сует внутрь результирующего массива
            resultArray[j] = ((Integer.parseInt(String.valueOf(newNumberSymbols[j]))));
        }

        return resultArray;
    }
    //Основное отличие в том, что Integer.parseInt() возвращает примитивный тип int,
    // а Integer.valueOf() возвращает объект Integer

    public static void qwe(int [] arr){
        if(arr[0]==0){
            System.out.println("Массив не должен начинаться с 0");
            return;
        }
        String str="";
        for(int i=0; i< arr.length; i++){
            str=str+String.valueOf(arr[i]);
        }

        Integer integer = Integer.valueOf(str);
        integer = integer+1;

        str = String.valueOf(integer);
        int [] result= new int[str.length()];

        for(int i=0; i<str.length(); i++){
            result[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(Arrays.toString(result));
    }

    public static void increaseByOne(int [] array){
        //2, 3, 4
        if(array[0]==0){
            System.out.println("Массив не должен начинаться с 0");
            return;
        }
        String str = "";
        for(int i=0; i< array.length; i++){
            str+=String.valueOf(array[i]);
        }
        Integer integer = Integer.valueOf(str);
        integer+=1;
        String str1 = String.valueOf(integer);
        int [] array1 = new int[str1.length()];
        String str2="";
        for(int i=0; i<str1.length(); i++){
            str2=String.valueOf(str1.charAt(i));
            array1[i]=Integer.parseInt(str2);
        }
        /*
        Метод Arrays.toString() в Java — это статический метод, предназначенный для преобразования одномерного массива
        в читаемую строку. Он возвращает строку вида "[элемент1, элемент2, ...]",разделяя элементы запятыми и заключая
        их в квадратные скобки. Иначе вернется хэш-код объекта
         */
        System.out.println(Arrays.toString(array1));
    }
}