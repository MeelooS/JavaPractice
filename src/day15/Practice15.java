package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/shoes.csv");
        Abc(file);
    }


    public static void Abc(File file) throws FileNotFoundException {
        File file1 = new File("src/day15/missing_shoes.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(file1);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] strings = line.split(";");
            if (Integer.parseInt(strings[2]) == 0){
                pw.println(strings[0]+", "+strings[1]+", "+strings[2]);
            }
        }
        scanner.close();
        pw.close();
    }
}