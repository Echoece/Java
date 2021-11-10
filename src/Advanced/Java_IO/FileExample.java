package Advanced.Java_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {

        // writing a string
        FileOutputStream fileOutputStream= new FileOutputStream("testing.txt");
        String str= "testing a string";
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();

        // reading a string
        FileInputStream fileInputStream= new FileInputStream("testing.txt");
        // creating array of bytes same size as the content to read from.
        byte[] b= new byte[fileInputStream.available()];
        fileInputStream.read(b);
        // converting the byte array to string
        String str1 = new String(b);
        System.out.println(str1);

        // reading letter by letter, since read() returns -1 once it reach end of stream
        // we can use following logic :
        int x;
        while ((x=fileInputStream.read())!=-1){
            System.out.print((char)x);
        }
        fileInputStream.close();

    }
}
