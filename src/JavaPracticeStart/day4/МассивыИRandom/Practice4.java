package JavaPracticeStart.day4.МассивыИRandom;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args){
        //1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
        // его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в консоль
        // информацию о:
        //а) Длине массива
        //б) Количестве чисел больше 8
        //в) Количестве чисел равных 1
        //г) Количестве четных чисел
        //д) Количестве нечетных чисел
        //е) Сумме всех элементов массива
        System.out.println("Задание 1");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введено число: ");
        int x = scanner.nextInt();
        System.out.print("Сгенерирован следующий массив: ");
        int[] massive = new int[x];
        for(int i =0; i<massive.length; i++){
            massive[i]= random.nextInt(10);
        }
        System.out.print(Arrays.toString(massive));
        System.out.println();
        System.out.println("Длина массива: " + x);
        int a=0;
        for(int i=0; i< massive.length; i++){
            if(massive[i]>8){
                a++;
            }
        }
        System.out.println("Количестве чисел больше 8: " + a);
        int b=0;
        for(int i=0; i< massive.length; i++){
            if(massive[i]==1){
                b++;
            }
        }
        System.out.println("Количестве чисел равных 1: " + b);
        int c=0;
        for(int i=0; i< massive.length; i++){
            if(massive[i]%2==0){
                c++;
            }
        }
        System.out.println("Количестве чётных чисел: " + c);
        int d=0;
        for(int i=0; i< massive.length; i++){
            if(massive[i]%2!=0){
                d++;
            }
        }
        int sum = 0;
        System.out.println("Количестве нечётных чисел: " + d);
        for(int i=0; i< massive.length; i++){
            sum = sum+massive[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);

        //2.Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        //Затем, используя циклы for each вывести:
        //- наибольший элемент массива
        //- наименьший элемент массива
        //- количество элементов массива, оканчивающихся на 0
        //- сумму элементов массива, оканчивающихся на 0
        //Использовать сортировку запрещено.
        System.out.println();
        System.out.println("Задание 2");
        int[] massive1 = new int[100];
        for(int i=0; i< massive1.length; i++){
            massive1[i]= random.nextInt(10000);
        }
        int max = massive1[0];
        for(int f:massive1){      //f-текущее число массива
            if(f>max){
                max=f;
            }
        }
        System.out.println("Наибольший элемент массива: "+max);
        int min = massive1[0];
        for(int f:massive1){
            if(f<min){
                min=f;
            }
        }
        System.out.println("Наименьший элемент массива: "+min);
        int o =0;
        for(int f:massive1){
            if(f%10==0){
                o++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: "+o);
        int sum1 = 0;
        for(int f:massive1){
            if(f%10==0){
                sum1=sum1+f;
            }
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: "+sum1);

        //3.Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
        //(m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки, сумма чисел в
        //которой максимальна. Если таких строк несколько, вывести индекс последней из них.
        System.out.println();
        System.out.println("Задание 3");
        int[][] matrix = new int[12][8];
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]= random.nextInt(50);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int maxSum =0;
        int index = 0;
        for(int i=0; i<matrix.length; i++){
            int sum2 = 0;
            for(int j=0; j<matrix[i].length; j++){
                sum2 = sum2 + matrix[i][j];
            }
            if(maxSum<sum2){
                maxSum=sum2;
                index=i;
            }
        }
        System.out.println();
        System.out.println(index + " (индекс строки, сумма чисел в которой максимальна)");

        //4.Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000. Найти
        // максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение
        // суммы и индекс первого элемента тройки.
        System.out.println();
        System.out.println("Задание 4");
        int[] massive2 = new int[100];
        int maxSum1 = 0;
        int firstInd = 0;
        for(int i =0; i<massive2.length; i++){
            massive2[i]= random.nextInt(10000);
        }
        for(int i =0; i<massive2.length-2; i++){
            int z = 0;
            for(int j=i; j<i+3; j++){
                z = z + massive2[j];
            }
            if(maxSum1<z){
                maxSum1=z;
                firstInd = i;
            }
        }
        System.out.println(maxSum1);
        System.out.println(firstInd);
    }
}
