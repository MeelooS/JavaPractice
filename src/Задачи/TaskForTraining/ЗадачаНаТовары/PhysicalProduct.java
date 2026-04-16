package Задачи.TaskForTraining.ЗадачаНаТовары;

public class PhysicalProduct extends Product{
    private int weight;
    public PhysicalProduct(String title, int price, int weight){
        super(title, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
