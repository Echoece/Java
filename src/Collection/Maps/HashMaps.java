package Collection.Maps;
        //A HashMap contains values based on the key.
        //
        //It contains only unique elements.
        //
        //It may have one null key and multiple null values.
        //
        //It maintains no order.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer,String> hashMap= new HashMap<>();
        /*Adding elements to HashMap*/
        hashMap.put(12, "Chaitanya");
        hashMap.put(2, "Rahul");
        hashMap.put(7, "Singh");
        hashMap.put(49, "Ajeet");
        hashMap.put(3, "Anuj");

        // Returns a Set view of the mappings contained in this map.
        Set set= hashMap.entrySet();
        // getting the iterator
        Iterator iterator=hashMap.entrySet().iterator();

    }
}
