package Задачи.TaskForTraining;

public class T14 {
    //Подсчитайте число появлений подстроки в строке.

    /*
    indexOf() - поиск первого вхождения символа или подстроки в строке. Он возвращает индекс (начиная с 0)
    найденного элемента или -1, если элемент не найден.

    indexOf(String str): ищет первое вхождение подстроки.
    indexOf(int ch): ищет первое вхождение символа.
    indexOf(String str, int fromIndex): ищет индекс подстроки, начиная с указанного индекса.
    indexOf(int ch, int fromIndex): ищет индекс символа, начиная с указанного индекса.
     */
    public static void main(String[] args){
//        String a = "ababcabcab";
//        String a1= "abc";
//        System.out.println(a.indexOf(a1,5));
//        System.out.println(countSubstr("ababcabcab", "abc"));
        QQQ("ababcabcab", "abc");
    }


    public static int countSubstr(String str, String substr){
        if(str.isEmpty() || substr.isEmpty()){
            return 0;
        }
        int index =0;
        int count=0;
        //Запись while(str.indexOf(substr, index)!=-1) будет неправильной, т.к. нам нужно начинать искать индексы сразу после 1-го вхождения, а не перебирать все индексы 0,1,2,... Тогда значение count будет неправильным (будет 6 вместо 2-х)
        while((index=str.indexOf(substr, index))!=-1){
            count++;
            index+=1;  //с учетом перекрывающихся вхождений. Без учета index=substr.length(), чтобы начинать с места, откуда в первый раз нашли substr
        }
        return count;
    }

    public static void QQQ(String str, String str1){
        int count=0;
        int index=0;
        while (str.indexOf(str1, index)!=-1){
            count++;
            index=str.indexOf(str1, index)+str1.length();
        }
        System.out.println(count);
    }
}
