package Loops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Loops {
    public void loopExample(){
        //for loop
        System.out.println("For Loop example :");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("********************************");

        //while loop
        System.out.println("While Loop Example:");
        int i = 0;  // initialize
        while (i < 5) {   // loop
            System.out.println(i);
            i++; // increment
        }

        //do while loop : this will run one time at first, then it checks condition and behave like a while loop.
        System.out.println("Do/While Loop Example");
        //start of do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);
        // end of do -while loop
        System.out.println("********************************");

        /*
        for each loop : it is usually used for traversing into a collection
            for (Type item : iterableCollection) {
                Do something to item
            }
        */
        System.out.println("ForEach Loop example:");
        // declaring arrayList and populating with dummy value
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.addAll(Arrays.asList("fruit","Fish","Meat"));
        // iterating through the collection
        for(String food: arrayList){
            System.out.println(food);
        }
    }
}
