package Задачи.TaskForTraining;

public class T3 {
    /*
    Необходимо написать метод, который во входящем массиве вернет максимальное число из массива
     */

    public static void main(String[] args){
        int[] array = {1,4,7,2077, 42, 33};
        int[] array1 = new int[5];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;

//        System.out.println(minust(array));

    }

    public static void max(int[] arr){
        int max=arr[0];
        for(int i=0; i< arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }



}
