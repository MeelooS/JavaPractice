package Задачи.TaskForTraining.ЗадачаНаТовары;

public class FixedDiscount implements Discountable{
    private int fixSum;

    public FixedDiscount(int fixSum){
        this.fixSum = fixSum;
    }

    public int getFixSum() {
        return fixSum;
    }

    public void setFixSum(int fixSum) {
        this.fixSum = fixSum;
    }
    @Override
    public double discount(double price){
        return fixSum;        //возвращаем сумму скидки
    }
}
