package Collection.Comparator.Excecise;

import java.util.*;

// Given an array arr[] of IP Addresses where each element is a IPv4 Address, the task is to sort the given IP addresses in increasing order.

// My Approach:: since its 4 octet of ip address range, i split each string into 4 part, and compare the parts individually.
//               i am assuming all the address do have 4 octet and not null etc, i skipped those checks since the purpose here was to learn the comparator.

public class IpProblem {
    public static void main(String[] args) {
        //String[]  arr = {"126.255.255.255", "169.255.0.0", "169.253.255.255"};
        String[]  arr = {"126.255.255.255", "126.255.255.255", "169.253.255.255"};
        Collections.sort(Arrays.asList(arr),new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // Splitting the octaves into a array of strings
                String[] obj1= o1.split("\\.");
                String[] obj2= o2.split("\\.");

                boolean isEqual=false;
                // loop for checking the order
                int i=0;
                // if both are equal, we proceed with checking the next octet, of course if its
                while (obj1[i].compareTo(obj2[i]) == 0){
                    if(i==obj1.length)
                        break;

                    if(i==obj1.length)
                        isEqual= true;

                    i++;
                }

                if(isEqual)
                    return 0;
                else
                    return obj1[i].compareTo(obj2[i]);
            }
        });

        for (String element:arr) {
            System.out.println(element);
        }
        System.out.println(arr);

    }
}
