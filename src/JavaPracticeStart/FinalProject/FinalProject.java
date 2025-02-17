package JavaPracticeStart.FinalProject;

import java.util.Random;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[][] battleField = new String[10][10];
        String[][] battleField1 = new String[10][10];
        String[][] battleField11 = new String[10][10];
        String[][] battleField12 = new String[10][10];
        BattleField field = new BattleField(battleField);
        BattleField field1 = new BattleField(battleField1);
        BattleField field11 = new BattleField(battleField11);
        BattleField field12 = new BattleField(battleField12);
        int i=0;

        //Начало игры
        System.out.println("Введите имя первого игрока:");
        String player =scanner.nextLine();
        System.out.println("Введите имя второго игрока:");
        String player1 =scanner.nextLine();


        System.out.println("Игрок "+player+" расставляет корабли");
        BattleField.createShip1(battleField);
        BattleField.createShip2(battleField);
        BattleField.createShip3(battleField);
        BattleField.createShip4(battleField);
        while(i!=10){
            System.out.println();
            i++;
        }

        System.out.println("Игрок "+player1+" расставляет корабли");
        BattleField.createShip1(battleField1);
        BattleField.createShip2(battleField1);
        BattleField.createShip3(battleField1);
        BattleField.createShip4(battleField1);
        while(i!=10){
            System.out.println();
            i++;
        }



        //выбираем, кто будет ходить первым
        Random random = new Random();
        int x = random.nextInt(2);
        System.out.println(x);
        //сама игра
        if(x==0){
            Game(player, player1, battleField, battleField1, battleField11, battleField12);
        } else {
            Game(player1, player, battleField1, battleField, battleField12, battleField11);
        }
    }

    public static void Game(String s, String s1, String[][] field, String[][] field1, String[][] field11, String[][] field12){
        String currentPlayerName = s;
        String[][] currentbattleField = field;
        String[][] currentbattleField1 = field1;
        String[][] currentbattleField11 = field11;
        while (BattleField.isAlive(currentbattleField1) && BattleField.isAlive(currentbattleField)){
            System.out.println("Ходит игрок: "+currentPlayerName);
            BattleField.printField(currentbattleField);
            System.out.println();
            BattleField.printField(currentbattleField11);
            System.out.println(currentPlayerName+":"+" "+"Введи координаты выстрела (формат x,y)");
            Scanner scanner = new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x>9 || y>9){
                System.out.println("Введенные координаты выходят за пределы поля. Введите валидные данные.");
                continue;
            }
            System.out.println(currentPlayerName+":"+" "+"Ввели: " + "x:" + x+", " + "y:" + y);
            boolean a= BattleField.shoot(currentPlayerName,currentbattleField1,currentbattleField11,x,y);
            if(a==false){
                if(currentPlayerName == s1){
                    currentPlayerName = s;
                    System.out.println("Промах! Ходит игрок: "+currentPlayerName);
                    currentbattleField=field;
                    currentbattleField1 = field1;
                    currentbattleField11 = field11;
                } else {
                    currentPlayerName = s1;
                    System.out.println("Промах! Ходит игрок: "+currentPlayerName);
                    currentbattleField=field1;
                    currentbattleField1 = field;
                    currentbattleField11 = field12;
                }
            }
        }
        System.out.println("Все корабли противника затоплены!");
        System.out.println("Победитель "+currentPlayerName);
    }


}