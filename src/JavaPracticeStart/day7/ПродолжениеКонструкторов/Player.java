package JavaPracticeStart.day7.ПродолжениеКонструкторов;

public class Player {
    private int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public Player(int stamina){
        this.stamina = stamina;
        if(countPlayers<6){
            countPlayers++;
        }
        System.out.println("У этого игрока выносливость равна: "+stamina+","+" Это игрок №"+countPlayers);
    }

    public int getStamina(){
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if (stamina>0){
            stamina = stamina -1;
            System.out.println("У этого игрока осталось выносливости: "+stamina);
        }
        if(stamina==0){
            countPlayers = countPlayers-1;
            System.out.println("Этот игрок уходит");
        }
    }

    public static void info(){
        System.out.println("Всего "+ countPlayers+" игроков");
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть "+(6-countPlayers)+" свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
