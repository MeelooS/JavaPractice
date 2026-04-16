package JavaPracticeStart.day11.Interface;

public class Warehouse{
    private int countOrder;
    private double balance;

    public int getCountOrder() {
        return countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return ("Кол-во собранных заказов равно "+countOrder+" ,"+"доход от доставленных заказов составляет "+balance);
    }

}
