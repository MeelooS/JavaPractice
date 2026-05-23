package Задачи.TaskForTraining;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T11 {
    //Напишите метод, который возвращает true, если в массиве есть повторяющиеся элементы.
    public static void main(String[] args){
        int [] arr = {1,2,3};
//        System.out.println(booleanDuplicate1(arr));
    }

    public static boolean booleanDuplicate(int [] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< arr.length; i++){
            if(!hashSet.add(arr[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean booleanDuplicate1(int[] arr) {
        for(int j=0; j<arr.length; j++){
            int a = arr[j];
            for (int i = j+1; i < arr.length; i++) {
                if(a==arr[i]){
                    return true;
                }
            }
        }

        return false;
    }
}