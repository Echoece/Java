package Basics.Reference;

import java.util.Arrays;

public class DeReferencing {
    public static void main(String[] args) {
        int[] myarray= {1,2,4,5};
        int[] anotherarray= myarray;
        System.out.println("array:: "+ Arrays.toString(myarray)
                + "\nanother array:: "+Arrays.toString(anotherarray));
        /*
            array:: [1, 2, 4, 5]
            another array:: [1, 2, 4, 5]
        */

        modifiedArray(anotherarray);
        System.out.println("after modify array:: "+ Arrays.toString(myarray)
                + "\nafter modify another array:: "+Arrays.toString(anotherarray));
        /*
            array:: [2, 2, 4, 5]
            another array:: [2, 2, 4, 5]
        */
    }



    private static void modifiedFirstElement(int[] array){
        array[0] =4;
    }


    private static void modifiedArray(int[] array){
        // at this point there is 3 reference (myarray , anotherarray, array) to the original array,
        array[0] = 2;
        // we are de-referencing  reference, in other words this pointer is pointing to a different location with the new keyword.
        // at this point only myarray and anotherarray pointing to the original array location , and array is pointing to the new location.
        array= new int[]{1,4,5,7,11};
    }
}
