package JavaPracticeStart.day14.СчитываниеИзФайла;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return ("{"+"name: "+name + ", "+"age: "+age+"}");
    }
}
