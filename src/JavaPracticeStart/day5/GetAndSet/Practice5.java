package JavaPracticeStart.day5.GetAndSet;
//Здесь я использую имя класса PracticeN вместо указанного в задании TaskN, чтобы сохранить заданную структуру проекта

public class Practice5 {
    public static void main(String[] args){
//        1.Создать класс Автомобиль (англ. Car), с полями “Год выпуска”, “Цвет”, “Модель”. Создать get и set методы
//        для каждого поля. Создать экземпляр класса Автомобиль, задать сеттером каждое поле, вывести в консоль значение
//        каждого поля геттером. Созданный вами класс должен отвечать принципам инкапсуляции.
        System.out.println("Задание 1");
        Car car = new Car();
        car.setYearOfManufacture(2010);
        car.setColourOfMachine("yellow");
        car.setModelOfMachine("Ferarri");
        System.out.println("Машина модели "+car.getModelOfMachine()+", "+car.getColourOfMachine()+" цвета"+", "+
                car.getYearOfManufacture()+" года выпуска");

//        2.Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,“Модель”. Создать экземпляр класса
//        Мотоцикл, с помощью конструктора (сеттеры не использовать). Придерживаться принципов инкапсуляции и
//        использовать ключевое слово this. Геттером получить год выпуска, цвет, модель, вывести значения в консоль.
        System.out.println();
        System.out.println("Задание 2");
        Motorbyke motorbyke = new Motorbyke(1980,"black", "Harley-Davidson");
        System.out.println("Мотоцикл модели "+motorbyke.getModel()+", "+motorbyke.getColour()+" цвета"+", "+
                motorbyke.getYear()+" года выпуска");

    }
}