package Задачи.TaskForTraining.ЗадачаНаТовары;

import java.util.List;

public class Main {
    /*
    Задача:
    Спроектировать систему, которая управляет заказом с товарами и скидками

    Шаг 1: Зафиксировать условия
    1) Есть 2 типа товаров - физический и цифровой:
      - DigitalProduct
      - PhysicalProduct
    2) У каждого товара есть:
      - Цена
      - Название
    3) У каждого  типа товаров есть свои уникальные поля поля:
      - Digital (fileSize) - размер товара (в байтах)
      - Physical (weight) - вес товара
    4) Есть 2 типа скидок - процентные и на фиксированную сумму:
      - PercentageDiscount
      - FixedDiscount

    Шаг 2: Пример использования
    1) Создается заказ
    2) В заказ ложится один или несколько товаров
    3) К заказу применяется скидка - фиксированная или процентная
    4) К заказу может применяться сразу несколько скидок
    5) Скидка применяется к общей цене
    6) Подсчитывается и выводится финальная сумма заказа с учетом скидок


    Шаг 3: Свойства, сущности, связи
    1) Сущности и связи товаров
       - Product (price, title)
       - DigitalProduct(fileSize) extends Product
       - PhysicalProduct(weight) extends Product

    2) Сущности и связи скидок
     - Discountable(discount()) - общая сущность; что-то, что подвержено скидке. У этой сущности будет действие применить скидку discount()
     - PercentageDiscount(percentage) - будет переопределяться discount()
     - FixedDiscount(fixSum) - будет переопределяться discount()

    3) Заказ
     - Order(products, discounts) - заказ содержит товары и скидки
     - метод calculateTotalPrice - будет подсчитывать итоговую сумму
     */

    public static void main(String[] args){
        Order order = new Order();
        order.addProduct(new DigitalProduct("Лекция", 30, 30));
        order.addProducts(List.of(new PhysicalProduct("Яблоко", 40, 5), new DigitalProduct("Жопа", 90, 100)));

        order.addDiscount(new PercentageDiscount(20));
        order.addDiscounts(List.of(new PercentageDiscount(30), new FixedDiscount(10)));

        System.out.println(order.calculatePrice());
    }
}
