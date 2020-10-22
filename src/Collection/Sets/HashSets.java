package Collection.Sets;

import java.util.Arrays;
import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        // the constructor have 3 more overloads,
        // 1) (int initialCapacity,float loadFactor)
        // 2) (int initialCapacity)
        // 3) (Collection<? extends E> c)
        HashSet<String> hashSet= new HashSet<>();
        hashSet.addAll(Arrays.asList("Dhaka", "Khulna","Chittagong","dhaka"));

        // Adds the specified element to this set if it is not already present.
        hashSet.add("Monipur");
        // Removes all of the elements from this set.
        hashSet.remove("Monipure");
    }

}
