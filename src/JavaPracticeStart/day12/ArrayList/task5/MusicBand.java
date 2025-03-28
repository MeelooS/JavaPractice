package JavaPracticeStart.day12.ArrayList.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist>musicArtist;

    public MusicBand(String name, int year, List<MusicArtist> musicArtist){
        this.name=name;
        this.year=year;
        this.musicArtist=musicArtist;
    }

    public List<MusicArtist> getMusicArtist() {      //создал геттер для прохождения по участникам списка

        return musicArtist;
    }

    public String toString(){
        return ("группа: "+name+", "+"год: "+year+", "+"участники: "+musicArtist+"\n");
    }

    public static void transferMembers(MusicBand a, MusicBand b){   //статический метод для всего класса
        for(MusicArtist musicArtist: a.getMusicArtist()){
            b.getMusicArtist().add(musicArtist);
        }
        a.getMusicArtist().clear();
    }

    public void transferMembers1(MusicBand b){    //метод для элементов этого класса
        for(MusicArtist musicArtist:musicArtist){
            b.getMusicArtist().add(musicArtist);
        }
        musicArtist.clear();
    }

    public void printMembers(){            //метод для элементов этого класса
        System.out.println(musicArtist);
    }

    public static void printMembers1(MusicBand a){
        System.out.println(a.getMusicArtist());
    }
   }
