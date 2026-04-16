package JavaPracticeStart.day11.Interface;


public class Practice11 {
    public static void main(String[] args){
        //1.На складе происходит сборка и упаковка интернет-заказа.
        //Создайте классы:
        //- “Склад” (Warehouse). Поля: countOrder (количество собранных заказов), balance (доход от доставленных
        //заказов).
        // Get и set методы для обоих полей. Для получения информации о значениях полей склада переопределите метод
        // toString().
        //- “Сборщик” (Picker), с полем salary, только get метод.
        //- “Курьер” (Courier), с полем salary, только get метод.
        //Каждый класс-сотрудник должен реализовывать интерфейс Worker, в котором необходимо объявить методы doWork() и
        //bonus(). Каждый раз когда сотрудник выполняет свою работу (вызов метод doWork()), ему выплачивается заработная
        //плата (сокр. ЗП) (80 - сборщику, 100 - курьеру). А также при вызове doWork() у Сборщика, происходит увеличение
        //значения поля countOrder в классе Warehouse на 1. При вызове doWork() у Курьера, происходит увеличение
        //переменной balance в классе Warehouse на 1000. Сотрудникам полагается бонус (индивидуальный расчет для
        //каждого): когда на складе отгружен 1500-й заказ, заработанная к тому моменту ЗП сборщика утраивается. Когда
        //складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
        //- Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему, вызовите у каждого методы
        //doWork() и bonus(), столько раз, чтобы каждый из сотрудников получил бонус.
        //- Выведите в консоль баланс и количество выполненных заказов на складе и ЗП каждого из сотрудников.
        //- Создать второй склад, также принять по 1 сотруднику с однократным вызовом doWork() у каждого.
        //- Проконтролировать, что у склада 1 и его сотрудников при этом значения не меняются.
        System.out.println("Задание 1");
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse1 = new Warehouse();
        Picker picker = new Picker();
        Picker picker1 = new Picker();
        Courier courier = new Courier();
        Courier courier1 = new Courier();

        picker.setWarehouse(warehouse);
        courier.setWarehouse(warehouse);

        System.out.println("Доход от доставленных заказов составляет " + warehouse.getBalance());
        System.out.println("Кол-во собранных заказов равно " + warehouse.getCountOrder());
        System.out.println("Picker "+picker.getSalary());
        System.out.println("Courier "+courier.getSalary());

        for(int i=1; i<=1500; i++){
            picker.doWork();
            picker.bonus();
        }

        while (warehouse.getBalance()<=2000){
            courier.doWork();
            courier.bonus();
        }

        System.out.println();
        System.out.println("Доход от доставленных заказов составляет " + warehouse.getBalance());
        System.out.println("Кол-во собранных заказов равно " + warehouse.getCountOrder());
        System.out.println("Picker "+picker.getSalary());
        System.out.println("Courier "+courier.getSalary());

        System.out.println();
        System.out.println();





        picker1.setWarehouse(warehouse1);
        courier1.setWarehouse(warehouse1);

        System.out.println("Доход от доставленных заказов составляет " + warehouse1.getBalance());
        System.out.println("Кол-во собранных заказов равно " + warehouse1.getCountOrder());
        System.out.println("Picker "+picker1.getSalary());
        System.out.println("Courier "+courier1.getSalary());

        picker1.doWork();
        courier1.doWork();

        System.out.println();
        System.out.println("Доход от доставленных заказов составляет " + warehouse1.getBalance());
        System.out.println("Кол-во собранных заказов равно " + warehouse1.getCountOrder());
        System.out.println("Picker "+picker1.getSalary());
        System.out.println("Courier "+courier1.getSalary());
    }
}
