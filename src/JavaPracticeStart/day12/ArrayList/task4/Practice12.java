package JavaPracticeStart.day12.ArrayList.task4;


import java.util.ArrayList;
import java.util.List;

public class Practice12 {
    public static void main(String[] args){
        String people1 = new String("Grace Slick");
        String people2 = new String("Marty Balin");
        String people3 = new String("Paul Kantner");
        String people4 = new String("Jorma Kaukonen");
        String people5 = new String("Jack Casady");
        String people6 = new String("Spencer Dryden");
        String people7 = new String("John Lennon");
        String people8 = new String("Paul McCartney");
        String people9 = new String("Ringo Star");
        String people10 = new String("George Harrison");

        List<String> peopleGroupA = new ArrayList<>();
        peopleGroupA.add(people1);
        peopleGroupA.add(people2);
        peopleGroupA.add(people3);
        peopleGroupA.add(people4);
        peopleGroupA.add(people5);
        peopleGroupA.add(people6);
        peopleGroupA.add(people7);
        peopleGroupA.add(people8);

        List<String> peopleGroupB = new ArrayList<>();
        peopleGroupB.add(people9);
        peopleGroupB.add(people10);

        MusicBand musicBand1 = new MusicBand("5diez", 2001, peopleGroupA);
        MusicBand musicBand2 = new MusicBand("5ive", 1990, peopleGroupB);
        System.out.println(musicBand1);
        System.out.println(musicBand2);
        MusicBand.transferMembers(musicBand1,musicBand2);
        System.out.println(musicBand1);
        System.out.println(musicBand2);
//        musicBand1.transferMembers1(musicBand2);
//        System.out.println(musicBand1);
//        System.out.println(musicBand2);


        musicBand1.printMembers();
        musicBand2.printMembers();
        System.out.println();
        MusicBand.printMembers1(musicBand1);
        MusicBand.printMembers1(musicBand2);
    }
}
