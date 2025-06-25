package JavaPracticeStart.day12.ArrayList.task5;

public class MusicArtist {
    private String name;
    private String surname;
    private int age;

    public MusicArtist(String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public String toString(){
        return (name+" "+surname);
    }
}
