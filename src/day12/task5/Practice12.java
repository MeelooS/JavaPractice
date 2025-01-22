package day12.task5;


import java.util.ArrayList;
import java.util.List;

public class Practice12 {
    public static void main(String[] args){
        MusicArtist musicArtist1 = new MusicArtist("Grace", "Slick", 20);
        MusicArtist musicArtist2 = new MusicArtist("Marty", "Balin", 21);
        MusicArtist musicArtist3 = new MusicArtist("Paul", "Kantner", 22);
        MusicArtist musicArtist4 = new MusicArtist("Jorma", "Kaukonen", 23);
        MusicArtist musicArtist5 = new MusicArtist("Jack", "Casady", 24);
        MusicArtist musicArtist6 = new MusicArtist("Spencer", "Dryden", 25);
        MusicArtist musicArtist7 = new MusicArtist("John", "Lennon", 26);
        MusicArtist musicArtist8 = new MusicArtist("Paul", "McCartney", 27);
        MusicArtist musicArtist9 = new MusicArtist("Ringo", "Star", 28);
        MusicArtist musicArtist10 = new MusicArtist("George", "Harrison", 29);

        List<MusicArtist> musicArtistsA = new ArrayList<>();
        musicArtistsA.add(musicArtist1);
        musicArtistsA.add(musicArtist2);
        musicArtistsA.add(musicArtist3);
        musicArtistsA.add(musicArtist4);
        musicArtistsA.add(musicArtist5);
        musicArtistsA.add(musicArtist6);
        musicArtistsA.add(musicArtist7);
        musicArtistsA.add(musicArtist8);

        List<MusicArtist> musicArtistsB = new ArrayList<>();
        musicArtistsA.add(musicArtist9);
        musicArtistsA.add(musicArtist10);

        day12.task5.MusicBand musicBand1 = new day12.task5.MusicBand("5diez", 2001, musicArtistsA);
        day12.task5.MusicBand musicBand2 = new day12.task5.MusicBand("5ive", 1990, musicArtistsB);
        System.out.println(musicBand1);
        System.out.println(musicBand2);
//      Статический метод
        day12.task5.MusicBand.transferMembers(musicBand1, musicBand2);
        System.out.println(musicBand1);
        System.out.println(musicBand2);

//        Метод для объектов
//        musicBand1.transferMembers1(musicBand2);
//        System.out.println(musicBand1);
//        System.out.println(musicBand2);


        musicBand1.printMembers();
        musicBand2.printMembers();
        System.out.println();
        day12.task5.MusicBand.printMembers1(musicBand1);
        day12.task5.MusicBand.printMembers1(musicBand2);
    }
}
