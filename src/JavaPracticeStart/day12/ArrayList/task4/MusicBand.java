package JavaPracticeStart.day12.ArrayList.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String>people;

    public MusicBand(String name, int year, List<String> people){
        this.name=name;
        this.year=year;
        this.people=people;
    }

    public List<String> getPeople() {      //создал геттер для прохождения по участникам списка
        return people;
    }

    public String toString(){
        return ("группа: "+name+", "+"год: "+year+", "+"участники: "+people+"\n");
    }

    public static void transferMembers(MusicBand a, MusicBand b){   //статический метод для всего класса
        for(String people: a.getPeople()){
            b.getPeople().add(people);
        }
        a.getPeople().clear();
    }

    public void transferMembers1(MusicBand b){    //метод для элементов этого класса
        for(String people:people){
            b.getPeople().add(people);
        }
        people.clear();
    }

    public void printMembers(){            //метод для элементов этого класса
        System.out.println(people);
    }

    public static void printMembers1(MusicBand a){
        System.out.println(a.getPeople());
    }
   }
