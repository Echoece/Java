package Advanced.Java_IO.Input_Output_Stream;

// OutStream is an abstract class, which is superclass of all classes representing output stream of bytes.
public class OutputStreamExample {
    //---------------------------------

    // this is a bit confusing, it takes 4 bytes(an int= 4 byte) as parameter, but writes only one byte, rest 3 bytes are ignored. not sure whats the use case of this
    void write(int b){

    }
    // this will write an array of bytes
    void write (byte[] b){

    }
    // here we can write part of a byte array, we can specify the starting offset and length to be written as well here.
    void write (byte[] b,int offset,int length){

    }
    //---------------------------------

    // this works on buffered-output stream. When we write the data using buffered output stream, the data goes into buffere,
    // and if we want to push the data into the resource, we can use this method.
    void flush(){

    }
    // closes the output stream and releases any system resources.
    void close(){

    }
}
