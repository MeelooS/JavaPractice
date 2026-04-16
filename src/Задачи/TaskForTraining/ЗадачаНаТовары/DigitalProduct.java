package Задачи.TaskForTraining.ЗадачаНаТовары;

public class DigitalProduct extends Product{
    private int fileSize;
    public DigitalProduct(String title, int price, int fileSize) {   //одним и тем же способом создавать сущности и их родителей
        super(title, price);  //вызываем конструктор родительского класса, т.е. как-бы прописываем строки  this.title = title и  this.price = price
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
}
