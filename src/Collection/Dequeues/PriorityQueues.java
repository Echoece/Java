package Collection.Dequeues;

import java.util.Comparator;
import java.util.PriorityQueue;
/* A PriorityQueue is used when the objects are supposed to be processed based on the priority.
   It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed
   to be processed according to the priority, that’s when the PriorityQueue comes into play. The PriorityQueue is based on
   the priority heap. The elements of the priority queue are ordered according to the natural ordering,
   or by a Collection.Comparator provided at queue construction time, depending on which constructor is used.  */
public class PriorityQueues {
    public static void main(String[] args)
    {

        PriorityQueue<String> queue =
                new PriorityQueue<String>(15, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() -o2.length();
                    }
                });
        queue.add("Tyrion Lannister");
        queue.add("Daenerys Targaryen");
        queue.add("Arya Stark");
        queue.add("Petyr 'Littlefinger' Baelish");

        /*
         * What I am doing here is removing the highest
         * priority element from Queue and displaying it.
         * The priority I have set is based on the string
         * length. The logic for it is written in Collection.Comparator
         */
        while (queue.size() != 0)
        {
            System.out.println(queue.poll());

        }
    }
}
