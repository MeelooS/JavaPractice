package JavaPracticeStart.day18.Рекурсии;

public class Practice18 {
    public static void main(String[] args){
        //1.Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя циклы
        //(необходимо использовать рекурсивные вызовы).
        //recursionSum - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.
        System.out.println("Задание 1");
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0)); // 65346

        //2.Создайте рекурсивный метод, который принимает на вход единственный аргумент - число, и возвращает количество
        //цифр 7 в этом числе. Циклы использовать запрещено, можно использовать только рекурсивные вызовы.
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println(count7(717771237)); // 5
    }

    public static int recursionSum(int[] ints, int i){
        if(i==ints.length){
            return 0;
        }
        return (ints[i] + recursionSum(ints, i + 1));
    }

    public static int count7(int i){
        if (i==0){
            return 0;
        }
        if(i%10 ==7){
            return 1+ count7(i/10);
        } else {
            return count7(i/10);
        }
    }
}
