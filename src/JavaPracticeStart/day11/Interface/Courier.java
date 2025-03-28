package JavaPracticeStart.day11.Interface;

public class Courier implements Worker{
    private float salary = 0;
    private Warehouse warehouse;        //ссылка на объект класса Warehouse

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public float getSalary() {
        return salary;
    }

    public void doWork() {
        salary = salary+100;
        warehouse.setBalance(warehouse.getBalance()+1000);
    }

    @Override
    public void bonus() {
        if(warehouse.getBalance()>1000000){
            salary=salary*2;
        }
//        else{
//            doWork();
//        }
    }

    public String toString(){
        return("Courier {"+"courier: "+salary+"}");
    }

}
