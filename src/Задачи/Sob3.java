package Задачи;

public class Sob3 {

    public static int[] arrayIncreaseNumber(int[] array) {
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
}

//Основное отличие в том, что Integer.parseInt() возвращает примитивный тип int,
// а Integer.valueOf() возвращает объект Integer
