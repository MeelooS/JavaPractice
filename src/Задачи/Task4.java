package Задачи;

public class Task4 {
    /*
    Написать метод, который проверяет слово на полиндромность
    Полиндромность - когда строка одинаковая с начала и конца. Например: ЩАлАШ, МАдАМ и т.д.
     */

    //1-й способ через цикл
    public static boolean polindrom(String str){
        String str1= str.toLowerCase();
        for(int i=0; i<str1.length()-1; i++){
            //ШАлАШ
            //Сравнивается 1-я Ш и последняя, потом 2-я А и предпоследняя и т.д. Поэтому - i
            if(str1.charAt(i)!= str1.charAt(str1.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    //2-й способ через StringBuilder
    public static void polindrom1(String str){
        StringBuilder d = new StringBuilder();
        String c = str.toLowerCase();
        //toString() - чтобы сравнить строку со строкой. Нельзя сравнить объекты String и StringBuilder
        if((d.append(c).reverse()).toString().equals(str.toLowerCase())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
