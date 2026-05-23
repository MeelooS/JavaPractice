package Задачи.TaskForTraining;

public class T8 {
    /*
    На вход приходят строка и символ. Посчитать, сколько раз данный символ встречается в строке.
     */

    public static void main(String[] args){

        countChar("qqqwweeeras", 'q');
    }

    public static void countChar(String str, char c){
        int count =0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }

}