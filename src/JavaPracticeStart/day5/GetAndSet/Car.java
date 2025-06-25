package JavaPracticeStart.day5.GetAndSet;

public class Car {
    private int yearOfManufacture;
    private String colourOfMachine;
    private String modelOfMachine;

    public void setYearOfManufacture(int year) {
        if (year >= 1900) {
            yearOfManufacture = year;
        } else {
            System.out.println("Значение поля не может быть отрицательным или выходящим за границы");
        }
    }

    public void setColourOfMachine(String colour){
        if(colour.isEmpty()){
            System.out.println("Значение поля не может быть пустым");
        } else {
            colourOfMachine = colour;
        }
    }

    public void setModelOfMachine(String model){
        if(model.isEmpty()){
            System.out.println("Значение поля не может быть пустым");
        } else {
            modelOfMachine = model;
        }
    }

    public int getYearOfManufacture(){
        return yearOfManufacture;
    }

    public String getColourOfMachine(){
        return colourOfMachine;
    }

    public String getModelOfMachine(){
        return modelOfMachine;
    }
}
