package DataTypes.Arrays;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] array= new int[]{1,6,73,22,34,76};

        Arrays.toString(array);
        Arrays.asList(array);
        Arrays.binarySearch(array,22);
        Arrays.compare(array,new int[]{2,4,6});

    }
}
