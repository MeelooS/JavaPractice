package Задачи.TaskForTraining.ЗадачаНаТовары;

public class PercentageDiscount implements Discountable{
    private int percentage;

    public PercentageDiscount(int percentage){
        this.percentage = percentage;
    }

    @Deprecated
    public double discount(double price){
        return price * percentage/100;   //возвращаем сумму скидки
    }
}
