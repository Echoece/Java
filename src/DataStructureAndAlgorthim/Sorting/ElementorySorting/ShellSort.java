package DataStructureAndAlgorthim.Sorting.ElementorySorting;
// we use Knuth's 3x+1 increment for the h-sort here

public class ShellSort {
    public static void shellsorting(Comparable[] a){
        int size = a.length;
        // h values = 1, 4, 13, 40, 121, 364 , ..............
        // here we finding the maximum h-pass
        int h = 1;
        while (h < size/3)
            h = 3*h + 1;
        // doing h-sort for each pass and decrementing
        while (h >= 1) {
            // h-sort the array using insertion sort, just adding the h as
            // how many places to pass.
            for (int i = h; i < size; i++) {
                for (int j = i; j >= h && lessthan(a[j], a[j-h]); j -= h) {
                    exchange(a, j, j-h);
                }
            }
            h /= 3;
        }
    }


    // if a < b  : returns true
    // if a>= b  : returns false
    public static boolean lessthan(Comparable a, Comparable b){
        return a.compareTo(b)<0;
    }

    // swapping two value in the array
    public static void exchange(Comparable[] a,int i, int j){
        Comparable temp = a[i];
        a[i]= a[j];
        a[j]=temp;
    }
}

