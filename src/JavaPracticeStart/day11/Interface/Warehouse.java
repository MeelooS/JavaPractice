package JavaPracticeStart.day11.Interface;

public class Warehouse{
    private int countOrder;
    private int balance;

    public void setCountOrder(int countOrder){
        this.countOrder=countOrder;
    }
    public int getCountOrder(){
        return countOrder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String toString(){
        return("Кол-во собранных заказов: "+countOrder+", "+"доход от доставленных заказов: "+balance);
    }

}
