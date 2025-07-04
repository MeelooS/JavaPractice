package JavaPracticeStart.day7.ПродолжениеКонструкторов;

public class Practice7 {
    public static void main(String[] args){
        //1.Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня. В классе Самолет
        // создать статический метод compareAirplanes, который в качестве аргументов принимает два объекта класса
        // Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
        System.out.println("Задание 1");
        Airplane airplane = new Airplane("British Aerospace", 2010, 29, 45);
        Airplane airplane1 = new Airplane("Airbus", 2024, 35, 48);
        Airplane.compareAirplanes(airplane,airplane1);

        //2.Дворовый футбол.
        //Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (Player),содержит следующие поля:
        //- поле “выносливость” (stamina), разное для каждого экземпляра
        //- константы “максимальная выносливость” (MAX_STAMINA) со значением 100 и “минимальная выносливость”
        // (MIN_STAMINA) со значением 0,единые для всех экземпляров
        //- статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0,
        // выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
        //- геттер для поля “выносливость”
        //и следующие методы:
        //run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость на 1 при однократном вызове.
        // Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
        //info() - выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит
        // сообщение: “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
        // Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.

        //Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при создании должен иметь значение
        // выносливости от 90 до 100 (генерировать внутри конструктора). Создать 6 игроков, вызвать метод info(). При
        // попытке создать 7,8 ...n игрока, количество игроков на поле меняться не должно, проверить это.
        //Примените к игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не
        // допускается). Вывести количество игроков на поле.
        System.out.println();
        System.out.println("Задание 2");
        Player player = new Player(90);
        Player player1 = new Player(100);
        Player player2 = new Player(97);
        Player player3 = new Player(95);
        Player player4 = new Player(93);
        Player player5 = new Player(96);
        for(int i=0; i<90; i++){
            if(i>89){
                break;
            } else{
                player.run();
            }
        }
        Player.info();
    }
}
