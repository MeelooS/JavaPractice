package Задачи;

public class Factorial {
    public static void factorial(int l){
        int q=1;
        for(int i=l; i>0; i--){
            q=q*i;
        }
        System.out.println(q);
    }


    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    static int fac(int r){
        int j=0;
        if(r==1){
            return 1;
        }
        return j=r*fac(r-1);
    }

}
