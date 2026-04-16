package Задачи.LeetCode;

public class Task3 {
    /*
    На вход подается число int. Если это число полиндромно, то возвращать true, иначе - false.
     */

    public static void main(String[] args){


    }

    public static boolean polindrome(int g){
        String str=String.valueOf(g);
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void polindrome1(int n){
        String str = String.valueOf(n);
        String countStr="";
        for(int i=str.length()-1; i>=0; i--){
            countStr+=str.charAt(i);
        }
        if(str.equals(countStr)){
            System.out.println("Полиндромно");
        } else {
            System.out.println("Не полиндромно");
        }
    }
}
