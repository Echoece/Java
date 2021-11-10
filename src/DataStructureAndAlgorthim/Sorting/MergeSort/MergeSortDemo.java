package DataStructureAndAlgorthim.Sorting.MergeSort;

public class MergeSortDemo {
    private static int CUTOFF=7;
    // this class should not be instantiated
    private MergeSortDemo(){}

    private static  void merge(Comparable[] arr, Comparable[] aux, int low, int mid, int high){
        assert isSorted(arr,low,mid);
        assert isSorted(arr,mid+1,high);

        // copying main array to auxiliary array
        for(int k=low; k <= high;k++)
            aux[k] = arr[k];

        int i = low;        // first half of aux array pointer
        int j = mid+1;      // second half of aux array pointer

        // merge back to arr[]
        for(int k=0; k<= high;k++){
            // case 1: if first half is depleted, we only use second half of the auxiliary array
            if(i>mid)
                arr[k] = aux[j++];

            // case 2: if second half is depleted, we only use first half of the auxiliary array
            else if(j>high)
                arr[k]= aux[i++];

            // case 3: if aux[j] is less than or equal to aux[i], we assign aux[j] to arr[k]
            else if(less(aux[j], aux[i]))
                arr[k] = aux[j++];

            // case 4: if aux[k] is less, we assign this.
            else
                arr[k] = aux[i++];
        }
        assert isSorted(arr,low,high);
    }

    private static void sort(Comparable[] arr, Comparable[] aux, int low, int high){
        // improvement 1: for smaller size array mergesort is too much overhead,
        if(high<= low + CUTOFF -1){
            // do insertion sort and then return
        }

        if(high<=low)
            return;

        int mid = low + (high - low)/2;

        // step1: recursively sorting first half
        sort(arr,aux, low, mid);
        // step 2: recursively sorting second half
        sort(arr,aux, mid+1, high);

        // improvement 2: if biggest item in the first half <= smallest item in the second half, then its already sorted


        // step 3: merging the sorted array
        merge(arr,aux,low,mid,high);
    }

    public static void mergeSort(Comparable[] arr){
        /*
            its important not to create the auxiliary array in the recursive function. It will create
            extra overhead in terms of space. This bug sometimes makes mergesort perform poorly. Thus it
            is created in this method which in turn calls the sorting method.
        */
        Comparable[] aux=new Comparable[arr.length];
        sort(arr,aux,0, arr.length-1);
        assert isSorted(arr);
    }

    /***************************************************************************
     *  Helper sorting function.
     ***************************************************************************/

    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /***************************************************************************
     *  Check if array is sorted - useful for debugging.
     ***************************************************************************/
    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
}

class Test{
    public static void main(String[] args) {
        Comparable<Integer>[] arr= new Comparable[]{1, 6, 343, 2, 77, 2, 11, 9};
        MergeSortDemo.mergeSort(arr);

    }
}
