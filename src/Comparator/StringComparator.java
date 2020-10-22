package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringComparator {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>( Arrays.asList("Nina", "Anika", "Munni","Luna","Abid","Ziad") );
        // printing the values
        System.out.println("Original List:");
        list.forEach((element)-> System.out.print(element+ " "));

        // sorting in ascending order
        System.out.println("\nAscending Order Sort using our own comparator:");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        list.forEach((element)-> System.out.print(element + " "));

        // sorting in descending order
        System.out.println("\nDescending Order Sort using our own comparator:");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        list.forEach((element)-> System.out.print(element + " "));

        // sorting in ascending order for the 2nd letter
        System.out.println("\nAscending order sort for the 2nd letter using our own comparator");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Character.compare(o1.charAt(1),o2.charAt(1)) ;
            }
        });
        list.forEach((element-> System.out.println(element+" ")));


    }

}
