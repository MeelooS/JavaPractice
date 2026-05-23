package Задачи.TaskForTraining;

public class T2 {
    /*
    Функция, на вход приходит строка, вернуть true - если палиндром, false - если не палиндром.
     */

    public static void main(String[] args){

        System.out.println(polindrom("шалаш"));
        System.out.println(polindrom("Бооб"));
        System.out.println(polindrom("молодец"));
        System.out.println(polindrom("мооролырвм"));


    }


    public static boolean polindrom(String str){
        int count=0;
        String newStr=str.toLowerCase();
        if((str.length())%2==0){
            for(int i=0; i<(str.length())/2; i++){
                if (newStr.charAt(i)==str.charAt(newStr.length()-1-i)){
                    count++;
                }
            }
            if(count == (str.length()/2)){
                return true;
            }
        }

        if(((str.length()-1)/2)%2==0){
            for(int i=0; i<(str.length()-1)/2; i++){
                if (newStr.charAt(i)==newStr.charAt(str.length()-1-i)){
                    count++;
                }
            }
            if(count == ((str.length()-1)/2)){
                return true;
            }
        }
        return false;
    }

    public static boolean polindrom1(String string){
        for(int i=0; i<string.length()-1; i++){
            if(string.toLowerCase().charAt(i)!=string.toLowerCase().charAt(string.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean polindrom2(String str){
        String newStr = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        if(stringBuilder.append(newStr).reverse().toString().equals(str.toLowerCase())){
            return true;
        }
        return false;
    }
}