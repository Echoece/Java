package DataStructureAndAlgorthim.Sorting.ElementorySorting;
// we assume that for every pass, the values on the left are sorted. So we only need to change the current value to the left
// if we need. This saves a little bit of work compared to selection sort.

public class InsertionSort {
    public static void InsertionSorting(Comparable[] a){
        int size = a.length;
        for(int i=0;i<size;i++){
            for (int j=i;j>0;j--){
                //checking if current value is less than its left value, if so we swap.
                if (lessthan(a[j],a[j-1]))
                    exchange(a,j,j-1);
                // if not, we wont have to do any more work
                else
                    break;
            }
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



