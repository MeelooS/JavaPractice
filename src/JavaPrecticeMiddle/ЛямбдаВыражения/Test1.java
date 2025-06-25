package JavaPrecticeMiddle.ЛямбдаВыражения;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args){
        //использование лямбда выражения в специальных методах, производимых с коллекциями и с массивами

                                                        //Пример1: map - method
        //map - специальный метод, который позволяет легко изменять наборы данных; берет каждый элемент из набора данных и сопоставляет ему новый элемент. Это сопоставление описываем с помощью лямбды. В аргументе должны отобразить логику сопоставления
        //Создадим сначала массив и лист
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        //Создадим методы для заполнения массива и листа:
        fillArr(arr);
        fillList(list);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        //Далее умножим каждый элемент массива и коллекции на 2(без использования лямбда выражений):
//        for(int i=0; i<10; i++){
//            arr[i] = arr[i]*2;
//            list.set(i,list.get(i)*2);
//        }

//        System.out.println(list);
//        System.out.println(Arrays.toString(arr));

        //Далее умножим каждый элемент массива и коллекции на 2(с использованием лямбда выражения):
        //Сначала для массива:
        //лямбда не может оперировать сразу на массиве(коллекции), нужно сначала превратить их в другие сущности(потоки)
        arr = Arrays.stream(arr).map(a -> a*2).toArray();                //stream - статический метод, который принимает на вход массив и на выходе получаем поток
        //Как это работает: мы принимаем на вход массив/лист и каждый элемент(а) итерируем по какой-то логике (в данном случае кажыдй элемент умножаем на 2). Затем ссылаем наш массив на этот stream и преобразуем stream в массив при помощи toArray (нельзя приравнять массив к stream)
        //Теперь для листа:
        list = list.stream().map(a -> a*2).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

                                                      //Немного тренировки
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArr(arr1);
        fillList(list1);
        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();
        arr1 = Arrays.stream(arr1).map(a -> a+1).toArray();
        list1 = list1.stream().map(a -> 3).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

                                                    //Пример2: filter - method и forEach - method
        //filter - фильтрует только нужные нам данные
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArr(arr2);
        fillList(list2);
        //Допустим нам нужны числа, которые делятся на 2 без остатка, т.е. четные
        arr2 = Arrays.stream(arr2).filter(a -> a%2==0).toArray();
        list2 = list2.stream().filter(a -> a%2==0).collect(Collectors.toList());
        //Как работает: если число удовлетворяет условию в скобках, то оно войдет в массив/лист, если нет - не войдет
        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));
        //forEach нужен для прохождения по всем элементам массива/листа b что-то с ними делаем
        Arrays.stream(arr2).forEach(a -> System.out.println(a));
        list2.stream().forEach(a -> System.out.println(a));

                                                  //Пример3: reduce - method
        //reduce - берет набор данных и сжимает его в один элемент. Имеет 2 аргумента: 1-й это аккумулятор (переменная-счетчик, которая каждый раз обновляется), а 2-й это текущий элемент
        //возьмем массив/лист и уменьшим его до одного элемента (сумма всех элементов = одно число, произвд-е всех элементов = одно число и т.п.)
        //посчитаем сумму всех эл-ов
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        fillArr(arr3);
        fillList(list3);
        int sum1 = Arrays.stream(arr3).reduce((acc, b)->acc+b).getAsInt();   ////getAsInt - преобразует поток в целое число
        //для листа посчитаем произведение всех эл-ов
        int sum2 = list3.stream().reduce((acc, b)->acc*b).get();
        System.out.println(sum1);
        System.out.println(sum2);

        //По умолчанию начальное значение аккумулятора равно первому элементу массива/листа. Но можно задать свое значение (в данном примере начальное значение равно 0). Делается это так: (обходится без getAsInt)
//        int sum3 = Arrays.stream(arr3).reduce(0,(acc, b)->acc+b);

                                               //Пример4: цепочка команд
        //Например, мы хотим получить только нечетные числа, умножить их на 2 и посчитать их сумму
        int[] arr4 = new int[10];
        fillArr(arr4);
        System.out.println(Arrays.toString(arr4));
        int product = Arrays.stream(arr4).filter(a -> a%2!=0).map(a->a*2).reduce((acc, a)->acc+a).getAsInt();
        System.out.println(product);
        //1, 3, 5, 7, 9 -> 2, 6, 10, 14 ,18 -> 50
    }
    private static void fillList(List<Integer> list) {
        for(int i=0; i<10; i++)
            list.add(i+1);
    }
    private static void fillArr(int[] arr) {
        for(int i=0; i<10; i++)
            arr[i]=i+1;
    }


}
