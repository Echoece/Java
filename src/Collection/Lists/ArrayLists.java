package Collection.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    // arraylist is a resizable array (), and it does the resize automatically. we can skip the type defination on the right part, but its ok to do so as well.
    // we can define the initial int capacity of the array in constructor , as well as adding a list of elements
    private List<String> groceryList = new ArrayList<>();

    public void arrayListProperty(){
        // appending object to grocery list at the end of the list
        groceryList.add("Food");
        // inserting object to 3rd index
        groceryList.add(3,"Egg");

        // appending all the elements of the collection to end of list
        groceryList.addAll(Arrays.asList( new String[]{"hello","hi"}) );
        // inserting all the element of the collection to specific index
        groceryList.addAll(3,Arrays.asList( new String[]{"hello","hi"}) );

        //remove all element
        groceryList.clear();
        // returns true if the list contains specific element
        boolean doesContain = groceryList.contains("hi");
        //Returns true if this list contains no elements.
        boolean isEmpty =groceryList.isEmpty();

        // foreach method: we can do stuff with it.
        groceryList.forEach( (element)-> System.out.println(element) );

        // Returns the element at the specified position in this list.
        groceryList.get(2);
        //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        groceryList.indexOf("hello");


    }
}
