package sec1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteExistingFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        File myFile;
        PrintWriter outputFile;
        String filename;
        char response = 'N';

        System.out.print("Enter the name of the file you wish to write a message to: ");
        filename = keyboard.nextLine();

        myFile = new File(filename);

        while (myFile.exists() && response != 'Y'){
            System.out.print("You are about to overwirte " + filename + " is this OK? (Y or N):");
            response = keyboard.nextLine().toUpperCase().charAt(0);

            if (response != 'Y'){
                System.out.print("Enter the name of the file you wish to write a message to: ");
                filename = keyboard.nextLine();

                myFile = new File(filename);
            }

        }

        outputFile = new PrintWriter(filename);

        outputFile.println("\n OBEDA \n");

        outputFile.close();


    }
}
