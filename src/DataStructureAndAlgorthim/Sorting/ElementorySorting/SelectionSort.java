package DataStructureAndAlgorthim.Sorting.ElementorySorting;

public class SelectionSort {
    public static void Selectionsorting(Comparable[] a){
        int size = a.length;
        for (int i=0;i<size;i++){
            int min = i;
            for (int j =i+1;j<size;j++){
                // checking if the current value is less than the minimum, if so we set min to current value.
                if(lessthan(a[j],a[min]) )
                    min=j;
            }
            // parameters : array , position of current index, and the minimum value index.
            exchange(a,i,min);
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
