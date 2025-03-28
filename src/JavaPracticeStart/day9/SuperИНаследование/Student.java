package JavaPracticeStart.day9.SuperИНаследование;

public class Student extends Human {
    private String nameOfStudyGroup;
    public Student(String name, String nameOfStudyGroup){
        super(name);
        this.nameOfStudyGroup = nameOfStudyGroup;
    }

    public void  setNameOfStudyGroup(String nameOfStudyGroup){
        this.nameOfStudyGroup = nameOfStudyGroup;
    }

    public String getNameOfStudyGroup(){
        return nameOfStudyGroup;
    }

    public void printInfo(){
        super.printInfo();                       //вызываем метод из родительского класса
        System.out.println("Этот студент с именем "+getName());
    }
}
