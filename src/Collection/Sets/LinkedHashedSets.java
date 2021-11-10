package Collection.Sets;
// LinkedHashSet class which is implemented in the collections framework is an ordered version of HashSet that maintains a
// doubly-linked List across all elements. When the iteration order is needed to be maintained this class is used

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashedSets {
    public static void main(String[] args) {
        // LinkedHashSet of DataTypes.String Type
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        lhset.add("Z");
        lhset.add("PQ");
        lhset.add("N");
        lhset.add("O");
        lhset.add("KK");
        lhset.add("FGH");
        System.out.println(lhset);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

        // Adding elements
        lhset2.add(99);
        lhset2.add(7);
        lhset2.add(0);
        lhset2.add(67);
        lhset2.add(89);
        lhset2.add(66);
        System.out.println(lhset2);

    }
}
