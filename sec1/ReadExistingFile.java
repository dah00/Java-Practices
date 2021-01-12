package sec1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadExistingFile {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner keyboard = new Scanner(System.in);
            File myFile;
            Scanner inputFile;
            String filename;

            System.out.print("Please enter the name of the file: ");
            filename = keyboard.nextLine();

            myFile = new File(filename);

            while (!myFile.exists()){
                System.out.println("The file you enter does not exist");

                System.out.print("Please enter the name of your file: ");
                filename = keyboard.nextLine();

                myFile = new File(filename);
            }

            inputFile =  new Scanner(myFile);
            System.out.println("\nTHE CONTENTS OF THE FILE ARE: \n");

            while (inputFile.hasNext()){
                System.out.println(inputFile.nextLine());
            }

            inputFile.close();
    }
}
