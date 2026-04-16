package Задачи.LeetCode;

import java.util.Arrays;

public class Task1 {

    /*
    Дан массив целоых чисел и какое-то число. Реализовать метод, который выводил индексы тех чисел, сумма которых
    равнялось бы указанному числу.

    Пример:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: nums[0] + nums[1] == 9, we return [0, 1].
    */
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(twoSum(arr, 11)));

        QQQ(arr, 11);

    }


        public static int[] twoSum(int[] nums, int target) {
            // Внешний цикл перебирает все элементы массива
            for(int i=0; i<nums.length; i++){
                // Внутренний цикл ищет пару для текущего элемента, начиная со следующего
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]==target-nums[i]){
                        return new int[] {j,i};
                    }
                }
            }
            return new int[]{};
        }


        //Метод, по моему мнению, более правильный, т.к. ищет все нужные комбинации, а не только одну как в пред. методе
        public static void QQQ(int [] arr, int target){
        for(int i=0; i<arr.length; i++){
            int a=arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(a+arr[j]==target){
                    System.out.println(Arrays.toString(new int[] {i,j}));
                }
            }
        }
        }

}
