package practice;

import java.io.File;
import java.io.IOException;

public class FileEyana {
    public static void main(String[] args) {
        try{
            File myFile = new File("C:\\FileDemo.txt");
            if (!myFile.createNewFile()) {
                System.out.println("File already exist: ");
            } else {
                System.out.println("File Created: " +myFile.getName());
            }
        }
        catch(IOException e){
            System.out.println("An error occurred: ");
        }
    }
}
