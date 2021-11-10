package Advanced.Java_IO.Input_Output_Stream;

// InputStream is an abstract class, which is superclass of all classes representing an input stream of bytes.
public class InputStreamExample {
    //---------------------------------
    // this method reads one byte from buffer, and the byte is consumed (means it is no longer present in buffer)
    // once it reach the end of stream, it will return -1. this implies we have reached the end of stream.
    int read() {
        return 0;
    }

    // this is another version of read, instead of reading one byte at a time, this read an array of bytes, depending
    // on the size of this parameter array.
    int read (byte[] b){
        return 0;
    }

    // in this version, we can mention from which offset we want to start reading the data, and the length as well
    int read(byte[] b,int offset,int length){
        return 0;
    }
    //---------------------------------

    // this method returns how many bytes are available in the stream.
    int available(){
        return 0;
    }

    // in case we want to skip some bytes, we can define here and it will skip reading those bytes
    long skip(long n){
        return 0;
    }

    //---------------------------------
    // we can put mark in the stream in case we dont the bytes to disappear after we consume it (which happens during read method)
    // limit = maximum limit of bytes that can be read before the mark position become invalid. once we cross this limit, the mark
    // becomes invalid
    void mark (int limit){

    }
    // this repositions the stream to the position where mark method is called. it only works only till the mark is valid.
    void reset(){

    }

    // tests if the stream supports mark (and reset as well). (bufferedstream supports mark)
    boolean markSupported(){
        return true;
    }
    //---------------------------------

    // we should close the stream after we finished using the resource
    void close(){

    }
}
