package DataTypes.String;

public class StringBufferDemo {
    public static void main(String[] args) {
        int capacitySize =5;
        int minimumCapacity= 10;
        String string = "some string";
        int index = 2;
        int startIndex = 2;
        int endIndex = 4;
        int size= 4;

        /* constructors */

        StringBuffer sb = new StringBuffer();                       // 16 capacity initial capacity
        StringBuffer sb1 = new StringBuffer(capacitySize);          // user defined capacity
        StringBuffer sb2 = new StringBuffer(string);                // capacity = string.length() + 16

        /* important methods */

        int length = sb2.length();                  // length of content
        int capacity = sb2.capacity();              // max length this object can hold
        char c = sb2.charAt(2);                     // can throw StringIndexOutOfBoundException
        sb2.setCharAt(index,'a');               // can throw StringIndexOutOfBoundException

        sb2 = sb2.append("444");                    // returns a reference of the object after append, can take any type
        sb2 = sb2.insert(startIndex,"aaa");     // insert characters at certain position
        sb2 = sb2.delete(startIndex,endIndex);      // delete from startIndex to (endIndex-1)
        sb2 = sb2.deleteCharAt(index);
        sb2 = sb2.reverse();

        sb2.setLength(size);                        // sets the length of the size, any extra characters will be removed
        sb2.ensureCapacity(minimumCapacity);        // sets the minimum capacity
        sb2.trimToSize();                           // trims buffer to the content size. extra memory spaces are deallocated





    }
}
