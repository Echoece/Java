package Collection.Comparator;
import java.util.*;
public class IntegerComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>( Arrays.asList(187,713,444,251,678,477,59) );
        // printing the values
        System.out.println("Original List:");
        list.forEach((element)-> System.out.print(element+ " "));

        // sorting in ascending order
        System.out.println("\nAscending Order Sort using our own comparator:");
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        list.forEach((element)-> System.out.print(element+" "));


        // sorting in descending order
        System.out.println("\nDescending Order Sort using our own comparator:");
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));               // lambda function example
        list.forEach((element)-> System.out.print(element+ " "));

        // sorting the list based on last number in ascending order
        System.out.println("\nAscending Order Sort for the last digit using our own comparator:");
        Collections.sort(list, Comparator.comparingInt(o -> (o % 10)));         // using the static utility function from Collection.Comparator
        list.forEach((element)-> System.out.print(element+ " "));

    }


}
