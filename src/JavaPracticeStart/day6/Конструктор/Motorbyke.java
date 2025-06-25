package JavaPracticeStart.day6.Конструктор;

public class Motorbyke {
    private int year;
    private String colour;
    private String model;

    public Motorbyke(int year, String colour, String model){
        if (year >= 1900) {
            this.year=year;
        } else {
            System.out.println("Значение поля не может быть отрицательным или выходящим за границы");
        }
        if(colour.isEmpty()){
            System.out.println("Значение поля не может быть пустым");
        } else {
            this.colour=colour;
        }
        if(model.isEmpty()){
            System.out.println("Значение поля не может быть пустым");
        } else {
            this.model=model;
        }

    }
    public int getYear(){
        return year;
    }

    public String getColour(){
        return colour;
    }

    public String getModel(){
        return model;
    }

    void info(){
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int year2){
        year2=year2-year;
        if (year2>0){
            return year2;
        } else{
            return Math.abs(year2);
        }
    }
}
