package sec1;

import java.io.*;
import java.util.Scanner;
//import java.io.PrintWriter;


public class Main {

    public static void main(String[] args) throws IOException {
        //PrintWriter identifier = new PrintWriter("myFile.txt");

        File myFile = new File("myFile.txt");
        Scanner myScanner = new Scanner(myFile);

        FileWriter fwriter = new FileWriter("myFile.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        outputFile.println("\nWhen the tears come down the stream");
        outputFile.println("But if you never try you never know");
        outputFile.println("Blablabla");

        outputFile.close();


        // Read from a file
        while(myScanner.hasNext())
            System.out.println(myScanner.nextLine());

        myScanner.close();


        // Write on a file
//        identifier.print("This is the title ");
//        identifier.println("This will be one the same line");
//        identifier.println("This will be on the next line");
//
//        identifier.close();

    }
}
