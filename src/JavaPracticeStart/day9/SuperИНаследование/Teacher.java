package JavaPracticeStart.day9.SuperИНаследование;

public class Teacher extends Human{

    private String nameOfLesson;
    public Teacher(String name, String nameOfLesson){
        super(name);
        this.nameOfLesson = nameOfLesson;
    }

    public String getNameOfLesson() {
        return nameOfLesson;
    }

    public void setNameOfLesson(String nameOfLesson) {
        this.nameOfLesson = nameOfLesson;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем "+ getName());
    }
}
