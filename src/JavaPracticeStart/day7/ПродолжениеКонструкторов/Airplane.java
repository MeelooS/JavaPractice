package JavaPracticeStart.day7.ПродолжениеКонструкторов;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel=0;

    public Airplane(String producer, int year, int length, int weight){
        this.producer=producer;
        this.year=year;
        this.length=length;
        this.weight=weight;
    }

    void info(){
        System.out.println("Изготовитель: "+producer+","+" год выпуска: "+year+","+" длина: "+length+","+" вес: "
                +weight+","+ " Количество топлива в баке: "+fuel);
    }

    int fillUp(int fuel1){
        fuel=fuel+fuel1;
        return fuel;
    }

    public void setProducer(String producer1){
        if(producer1.isEmpty()){
            System.out.println("Поле не может быть пустым");
        } else {
            producer=producer1;
        }
    }

    public void setYear(int year1){
        if(year1<2000){
            System.out.println("Такой старый самолет летать не может");
        } else{
            year=year1;
        }
    }

    public void setLength(int length1){
        if(length1<5){
            System.out.println("Самолет не может быть таким маленьким");
        } else{
            length=length1;
        }
    }

    public void setWeight(int weight1){
        if(weight1<0){
            System.out.println("Пустой самолет не взлетит");
        } else{
            weight=weight1;
        }
    }
    public static void compareAirplanes(Airplane airplane, Airplane airplane1){
        if(airplane.length>airplane1.length){
            System.out.println("Длина 1-го самолета больше");
        } else {
            System.out.println("Длина 2-го самолета больше");
        }
    }
}
