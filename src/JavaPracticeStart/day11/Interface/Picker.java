package JavaPracticeStart.day11.Interface;

public class Picker implements Worker{
    private int salary;
    private Warehouse warehouse;   //ссылка на объект класса Warehouse

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary+80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder()>1500){
            salary=salary*3;
        }
//        else {
//            doWork();
//        }
    }

    public String toString(){
        return("Picker {"+"salary: "+salary+"}");
    }


}
