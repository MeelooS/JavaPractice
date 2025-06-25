package JavaPracticeStart.FinalProject;

import java.util.Scanner;

public class BattleField {
    static String [][] battleField;
    public BattleField(String[][] battleField){
        this.battleField = battleField;
        for (int i=0; i<battleField.length; i++){
            for (int j=0; j<battleField[i].length; j++){
                battleField[i][j] = "⬜";
            }
        }
    }

    //Метод для визуализации поля
    public static void printField(String[][] battleField){
        for (int i=0; i<battleField.length; i++){
            for (int j=0; j<battleField[i].length; j++){
                System.out.print(battleField[i][j]);
            }
            System.out.println(" ");
        }
    }

                                               //СОЗДАНИЕ КОРАБЛЕЙ
    //однопалубник
    public static void createShip1(String[][] battleField){
        for (int i = 0; i < 4; i++) {
            int deck=1;
            System.out.println("Введите координаты однопалубного корабля: ");
            Scanner scanner = new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x> battleField.length-1 || y> battleField.length-1){
                System.out.println("Введенные координаты выходят за пределы поля. Введите валидные данные.");
                i--;
                continue;
            }
            System.out.println("Ввели: " + "x:" + x+", " + "y:" + y);
            if(!isAvaliable(x,y,deck,battleField)){
                System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть " +
                        "других кораблей (ореол корабля). Введите другие координаты!");
                createShip1(battleField);
            } else {
                battleField[x][y] = "\uD83D\uDEA2";
                printField(battleField);
            }
        }
        System.out.println("Больше нельзя создавать корабли данного типа!");
        System.out.println();
    }

    //двухпалубник
    public static void createShip2(String[][] battleField){
        for (int i = 0; i < 3; i++){
            int deck=2;
            System.out.println("Введите координаты двухпалубного корабля: ");
            Scanner scanner = new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x> battleField.length-1 || y> battleField.length-1){
                System.out.println("Введенные координаты выходят за пределы поля. Введите валидные данные.");
                i--;
                continue;
            }
            System.out.println("Ввели: " + "x:" + x+", " + "y:" + y);
            System.out.println("Выберите направление:");
            System.out.println("1.Вертикальное");
            System.out.println("2.Горизонтальное");
            int direction = scanner.nextInt();
            if(direction==1){
                if(!isAvaliable(x,y,deck,battleField)){
                    System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть " +
                            "других кораблей (ореол корабля). Введите другие координаты!");
                    createShip2(battleField);
                } else {
                    if(battleField[x][y] == "⬜" && battleField[x+1][y] == "⬜"){
                        battleField[x][y] = "\uD83D\uDEA2";
                        battleField[x+1][y] = "\uD83D\uDEA2";
                        printField(battleField);
                    } else {
                        System.out.println("Корабль невозможно разместить! Место занято! Введите другие координаты!");
                        createShip2(battleField);
                    }
                }
            } else {
                if(!isAvaliable(x,y,deck,battleField)){
                    System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть " +
                            "других кораблей (ореол корабля). Введите другие координаты!");
                    createShip2(battleField);
                } else {
                    if(battleField[x][y] == "⬜" && battleField[x][y+1] == "⬜"){
                        battleField[x][y] = "\uD83D\uDEA2";
                        battleField[x][y+1] = "\uD83D\uDEA2";
                        printField(battleField);
                    } else {
                        System.out.println("Корабль невозможно разместить! Место занято! Введите другие координаты!");
                        createShip2(battleField);
                    }
                }
            }
        }
        System.out.println("Больше нельзя создавать корабли данного типа!");
        System.out.println();
    }
    //трехпалубник
    public static void createShip3(String[][] battleField){
        for (int i = 0; i < 2; i++){
            int deck=3;
            System.out.println("Введите координаты трехпалубного корабля: ");
            Scanner scanner = new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x> battleField.length-1 || y> battleField.length-1){
                System.out.println("Введенные координаты выходят за пределы поля. Введите валидные данные.");
                i--;
                continue;
            }
            System.out.println("Ввели: " + "x:" + x+", " + "y:" + y);
            System.out.println("Выберите направление:");
            System.out.println("1.Вертикальное");
            System.out.println("2.Горизонтальное");
            int direction = scanner.nextInt();
            if(direction==1){
                if(!isAvaliable(x,y,deck,battleField)){
                    System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть " +
                            "других кораблей (ореол корабля). Введите другие координаты!");
                    createShip3(battleField);
                } else {
                    if(battleField[x][y] == "⬜"
                            && battleField[x+1][y] == "⬜"
                            && battleField[x+2][y] == "⬜"){
                        battleField[x][y] = "\uD83D\uDEA2";
                        battleField[x+1][y] = "\uD83D\uDEA2";
                        battleField[x+2][y] = "\uD83D\uDEA2";
                        printField(battleField);
                    } else {
                        System.out.println("Корабль невозможно разместить! Место занято! Введите другие координаты!");
                        createShip3(battleField);
                    }
                }
            } else {
                if(!isAvaliable(x,y,deck,battleField)){
                    System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть " +
                            "других кораблей (ореол корабля). Введите другие координаты!");
                    createShip3(battleField);
                } else {
                    if(battleField[x][y] == "⬜"
                            && battleField[x][y+1] == "⬜"
                            && battleField[x][y+2] == "⬜"){
                        battleField[x][y] = "\uD83D\uDEA2";
                        battleField[x][y+1] = "\uD83D\uDEA2";
                        battleField[x][y+2] = "\uD83D\uDEA2";
                        printField(battleField);
                    } else {
                        System.out.println("Корабль невозможно разместить! Место занято! Введите другие координаты!");
                        createShip3(battleField);
                    }
                }
            }
        }
        System.out.println("Больше нельзя создавать корабли данного типа!");
        System.out.println();
    }
    //четырехпалубник
    public static void createShip4(String[][] battleField){
        for (int i = 0; i < 1; i++){
            int deck=4;
            System.out.println("Введите координаты четырехпалубного корабля: ");
            Scanner scanner = new Scanner(System.in);
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(x> battleField.length-1 || y> battleField.length-1){
                System.out.println("Введенные координаты выходят за пределы поля. Введите валидные данные.");
                i--;
                continue;
            }
            System.out.println("Ввели: " + "x:" + x+", " + "y:" + y);
            System.out.println("Выберите направление:");
            System.out.println("1.Вертикальное");
            System.out.println("2.Горизонтальное");
            int direction = scanner.nextInt();
            if(direction==1){
                if(!isAvaliable(x,y,deck,battleField)){
                    System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть " +
                            "других кораблей (ореол корабля). Введите другие координаты!");
                    createShip4(battleField);
                } else {
                    if(battleField[x][y] == "⬜"
                            && battleField[x+1][y] == "⬜"
                            && battleField[x+2][y] == "⬜"
                            && battleField[x+3][y] == "⬜"){
                        battleField[x][y] = "\uD83D\uDEA2";
                        battleField[x+1][y] = "\uD83D\uDEA2";
                        battleField[x+2][y] = "\uD83D\uDEA2";
                        battleField[x+3][y] = "\uD83D\uDEA2";
                        printField(battleField);
                    } else {
                        System.out.println("Корабль невозможно разместить! Место занято! Введите другие координаты!");
                        createShip4(battleField);
                    }
                }
            } else {
                if(!isAvaliable(x,y,deck,battleField)){
                    System.out.println("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть " +
                            "других кораблей (ореол корабля). Введите другие координаты!");
                    createShip4(battleField);
                } else {
                    if(battleField[x][y] == "⬜"
                            && battleField[x][y+1] == "⬜"
                            && battleField[x][y+2] == "⬜"
                            && battleField[x][y+3] == "⬜"){
                        battleField[x][y] = "\uD83D\uDEA2";
                        battleField[x][y+1] = "\uD83D\uDEA2";
                        battleField[x][y+2] = "\uD83D\uDEA2";
                        battleField[x][y+3] = "\uD83D\uDEA2";
                        printField(battleField);
                    } else {
                        System.out.println("Корабль невозможно разместить! Место занято! Введите другие координаты!");
                        createShip4(battleField);
                    }
                }
            }
        }
        System.out.println("Больше нельзя создавать корабли данного типа!");
        System.out.println();
    }


    public static boolean shoot(String s, String[][] battleField, String[][] battleField1, int x, int y){
        //s - кто стреляет, battleField - куда стреляет, battleField1 - поле, на котором отображаются попадания и промахи
        // если попадание
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите направление:");
        System.out.println("1.Вертикальное");
        System.out.println("2.Горизонтальное");
        int direction = scanner.nextInt();
        if(battleField[x][y]=="\uD83D\uDEA2"){
            battleField[x][y]="\uD83D\uDFE5";
            battleField1[x][y]="\uD83D\uDFE5";
            System.out.println("Попадание!");
            if(direction==1 && battleField[x+1][y]=="⬜"){
                System.out.println("Корабль затоплен!");
            }
            if(direction==2 && battleField[x][y+1]=="⬜"){
                System.out.println("Корабль затоплен!");
            }
            return true;
        }
        battleField1[x][y]="\uD83D\uDFE6";
        return false;
    }

    public static boolean isAlive(String[][] battleField){
        for (int i=0; i<battleField.length; i++){
            for (int j=0; j<battleField[i].length; j++){
                if(battleField[i][j]=="\uD83D\uDEA2"){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isAvaliable(int x, int y, int deck, String[][] battleField){     //deck - кол-во палуб
        //проверка на ореолы
        for (int i = 0; i < deck; i++) {
            if(x+1+i< battleField.length && x+1+i>=0 && y+i< battleField.length && y+i>=0){
                if(battleField[x+1+i][y+i]!="⬜"){
                    return false;
                }
            }
            if(x-1+i< battleField.length && x-1+i>=0 && y+i< battleField.length && y+i>=0){
                if(battleField[x-1+i][y+i]!="⬜"){
                    return false;
                }
            }
            if(y+1+i< battleField.length && y+1+i>=0 && x+i< battleField.length && x+i>=0){
                if(battleField[x+i][y+1+i]!="⬜"){
                    return false;
                }
            }
            if(y-1+i< battleField.length && y-1+i>=0 && x+i< battleField.length && x+i>=0){
                if(battleField[x+i][y-1+i]!="⬜"){
                    return false;
                }
            }
            //диагональные клетки
            if(x-1+i< battleField.length && x-1+i>=0 && y-1+i< battleField.length && y-1+i>=0){
                if(battleField[x-1+i][y-1+i]!="⬜"){
                    return false;
                }
            }
            if(x+1+i< battleField.length && x+1+i>=0 && y-1+i< battleField.length && y-1+i>=0){
                if(battleField[x+1+i][y-1+i]!="⬜"){
                    return false;
                }
            }
            if(x+1+i< battleField.length && x+1+i>=0 && y+1+i< battleField.length && y+1+i>=0){
                if(battleField[x+1+i][y+1+i]!="⬜"){
                    return false;
                }
            }
            if(x-1+i< battleField.length && x-1+i>=0 && y+1+i< battleField.length && y+1+i>=0){
                if(battleField[x-1+i][y+1+i]!="⬜"){
                    return false;
                }
            }
        }
        return true;
    }
}
