package DataStructureAndAlgorthim.Sorting.ElementorySorting;
// making something shuffle is very important cause we dont want to make it obvious for others to decode.

// instead of random class (which uses our clock as seed and knuths algorithm) we can use securerandom class which uses random things from our
// OS as seed.

/*
    SecureRandom random = new SecureRandom();

    int max=50;
    int min =1;

    System.out.println(random.nextInt(max-min+1)+min);
*/
import java.security.SecureRandom;

public class ShuffleSort {

    public static void ShuffleSorting(Comparable[] a){
        int size = a.length;
        SecureRandom random = new SecureRandom();
        int min=0,max;
        // here its required to choose a uniform random number between 0  to i or
        // i to (size-1). A common bug programmers do is choose a random number between whole array.
        // but that wont be uniform anymore.
        for (int i=0;i<size;i++){
            max=i;
            int r = random.nextInt(max-min+1)+min;
            exchange(a,i, r);
        }
    }


    // swapping two value in the array
    public static void exchange(Comparable[] a,int i, int j){
        Comparable temp = a[i];
        a[i]= a[j];
        a[j]=temp;
    }
}



