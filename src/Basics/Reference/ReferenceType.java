package Basics.Reference;

import java.util.Arrays;

public class ReferenceType {
    // this is a simple topic which i keep making mistake for not paying enough attention to the code >.< . well basically the difference between
    // value type and reference type i need to keep in mind, that's why i wrote this class.

    // note:: in case we want to make a copy of the object itself, not the reference , we can use the clone() method.
    public static void main(String[] args) {

        // in case of value type , here we just assigning the value 10 to the number variable. there is no new keyword here. so when we
        // assign number to anotherNumber, we just assign the value. So any changes made on these variables will be separate
        int number= 10;
        int anotherNumber = number;
        System.out.println("number :"+number+" anotherNumber: "+anotherNumber); // output=> number :10 anotherNumber: 10
        //here if we increase the anothernumber value , it wont affect the number. they are stored seperate location
        anotherNumber++;
        System.out.println("number :"+number+" anotherNumber: "+anotherNumber); // output=> number :10 anotherNumber: 11
        //--------------------------------------------------------

        // in case of reference type though, its different. when we assign a reference to an object with new keyword, we just
        // refer to a location of that object. so if we assign another object with this, we would be pointing at the same location in the memory
        // just with different name; for example,
        int[] array= {1,2,4,5};
        int[] anotherarray= array;
        System.out.println("array:: "+ Arrays.toString(array) + "\nanother array:: "+Arrays.toString(anotherarray));
        /*
        output::
            array:: [1, 2, 4, 5]
            another array:: [1, 2, 4, 5]
        */
        // but here if we change something in either of the arrays, both will have same change, because we are actually changing the values
        // where it is pointing to.
        array[3]= 88;
        System.out.println("array:: "+ Arrays.toString(array) + "\nanother array:: "+Arrays.toString(anotherarray));
        /*
        output::
            array:: [1, 2, 4, 88]
            another array:: [1, 2, 4, 88]
        */
    }

}
