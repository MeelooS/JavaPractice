package Задачи.TaskForTraining;

public class T15 {
    // Написать функцию, которая пишет текст в центре прямоугольной рамки (из символов #)
    // В качестве входных параметров - выводимый текст, ширина и высота прямоугольной рамки

    // Пример вывода:

    //   printInBox("Hello, World!", 17, 5)
    //   #################
    //   #               #
    //   # Hello, World! #
    //   #               #
    //   #################

    public static void main(String[] args){
        QQQ("asd", 9,5);

    }


    public static void printBox(String string, int n, int m){
        for(int i=1; i<=n; i++){
            System.out.print("#");
        }
        System.out.println();
        for (int j=1; j<=m-2; j++){
            if(j==((m-2-1)/2+1)){
                System.out.print("#"+" ".repeat((n-2-string.length())/2)+string+" ".repeat((n-2-string.length())/2)+"#");
                System.out.println();
            } else {
                System.out.print("#"+" ".repeat(n-2)+"#");
                System.out.println();
            }

        }
        for(int i=1; i<=n; i++){
            System.out.print("#");
        }
    }

    public static void QQQ(String string, int length, int weight){
        for(int i=0; i<length; i++){
            System.out.print("#");
        }
        System.out.println();
        for(int i=1; i<=weight-2; i++){
            if(i==(weight-2-1)/2+1){
                System.out.print("#"+" ".repeat((length-2-string.length())/2)+string+" ".repeat((length-2-string.length())/2)+"#");
                System.out.println();
            } else {
                System.out.print("#"+" ".repeat(length-2)+"#");
                System.out.println();
            }
        }
        for(int i=0; i<length; i++){
            System.out.print("#");
        }
    }
}
