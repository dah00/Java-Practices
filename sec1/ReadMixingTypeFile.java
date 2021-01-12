package sec1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMixingTypeFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        File myFile;
        Scanner inputFile;
        String filename;

        System.out.print("Pease enter the name of the file: ");
        filename = keyboard.nextLine();

        myFile = new File(filename);

        while (!myFile.exists()){
            System.out.print("Your file does not exists, please enter an existing file: ");
            filename = keyboard.nextLine();

            myFile = new File(filename);

        }

        inputFile = new Scanner(myFile);
        inputFile.useDelimiter("[^0-9]+");

        System.out.println("HERE ARE THE INTEGER TYPE FROM THE FILE");
        while (inputFile.hasNext()){
            System.out.println(inputFile.next());
        }


        inputFile.close();
    }
}
