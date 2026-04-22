package Задачи.SBR;

public class Sob7 {
    public int positiveSum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                sum+=arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        //массив содержит 2 эл-та:
        // 1) Integer.MAX_VALUE (2_147_483_647)
        // 2) и 1
        System.out.println(new Sob7().positiveSum(    //new Sob7() - создание нового объекта класса Sob7
                new int[] {Integer.MAX_VALUE, 1}
        ));
        /*
        Т.е. к 2_147_483_647 прибавляется 1 = 2_147_483_648
        Но 2_147_483_647 - это макс. значение, и когда к нему прибавляется 1, то происх. переполнение,
        т.е. число возвращается к отрицательному диапазону -2_147_483_648
         */
    }
}
