package Задачи;

public class Task5 {
    /*
    На вход приходят строка и символ. Посчитать, сколько раз данный символ
    встречается в строке.
     */

    public static void countChar(String s, char q){
        int count = 0;
        for(int i=0; i<=s.length()-1; i++){
            if(q==s.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
