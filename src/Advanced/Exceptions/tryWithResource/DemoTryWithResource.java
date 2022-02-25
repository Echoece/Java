package Advanced.Exceptions.tryWithResource;

import java.io.FileReader;
import java.io.IOException;

public class DemoTryWithResource {
    public static void main(String[] args)  {
    }

    static void notUsingAnyExceptionHandler() throws IOException{
        FileReader fileReader;

        fileReader = new FileReader("Filename.txt"); // opening resource
        // ... dome some work  - > using resource
        fileReader.close();  // closing resource

        // in this case, exception will thrown if file not found, so the resource will never be closed since that line
        // wont be executed.
    }

    static void usingFinally() throws IOException {
        FileReader fileReader = null;

        try{
            fileReader = new FileReader("Filename.txt"); // opening resource
            // ... dome some work  - > using resource
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            fileReader.close();  // closing resource
        }

        // in this case, exception will thrown if file not found, and the resource will be closed since its inside finally block
    }

    static void usingTryWithResource() throws IOException{

        try(FileReader fileReader = new FileReader("FileName.txt")){
            // .. use resource
        }

        // in this case we dont need finally block for closing resource, try will take care of it.
    }
}
