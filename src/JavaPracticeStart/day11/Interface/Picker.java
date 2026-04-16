package JavaPracticeStart.day11.Interface;


public class Picker implements Worker{
    private double salary;
    Warehouse warehouse;


    //этот метод нужен для того, чтобы в аргументах указывать нужный созданный склад. Иначе при компиляции будет ошибка, т.к. машине непонятно, с каким объектом склада мы работаем, т.к. мы можем создать несколько объектов склада
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public void doWork() {
        salary+=80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
    }

    @Override
    public void bonus() {
        if(warehouse.getCountOrder()==1500){
            salary=salary*3;
        }
    }


}
