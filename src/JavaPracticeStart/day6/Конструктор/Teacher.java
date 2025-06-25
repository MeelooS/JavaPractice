package JavaPracticeStart.day6.Конструктор;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    private String mark;
    private Random random = new Random();

    public Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }

    public void evaluate(Student student){
        int i= random.nextInt(4)+2;
        if(i==2){
            mark="неудовлетворительно";
        } else if (i==3) {
            mark="удовлетворительно";
        } else if (i==4) {
            mark="хорошо";
        } else {
            mark="отлично";
        }
        System.out.println("Преподаватель "+name+" оценил студента с именем "+student.getName()+" по предмету "+subject+
                " на оценку " +mark);
    }
}
