package Collection.Lists;

import java.util.*;

public class ArrayLists {
    // arraylist is a resizable array (), and it does the resize automatically. we can skip the type definition on the right part, but its ok to do so as well.
    // we can define the initial int capacity of the array in constructor , as well as adding a list of elements
    private final ArrayList<String> groceryList = new ArrayList<>();

    public void arrayListProperty(){

        // appending object to grocery list at the end of the list
        groceryList.add("Food");
        // inserting object to 3rd index, it will shift the current element in to the right side of the array
        groceryList.add(3,"Egg");
        //Replaces the element at the specified position in this list with the specified element.
        groceryList.set(1,"hello");
        // appending all the elements of the collection to end of list
        groceryList.addAll(Arrays.asList( "hello","hi") );
        // inserting all the element of the collection to specific index
        groceryList.addAll(3,Arrays.asList( "hello","hi") );

        //----------------------------------------------

        //remove all element
        groceryList.clear();
        // returns true if the list contains specific element
        boolean doesContain = groceryList.contains("hi");
        //Returns true if this list contains no elements.
        boolean isEmpty =groceryList.isEmpty();
        //Returns the number of elements in this list.
        int size = groceryList.size();

        // Returns the element at the specified position in this list.
        String groceryElement= groceryList.get(2);
        //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        groceryList.indexOf("hello");
        // Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        int index = groceryList.lastIndexOf("hi");
        // returns from this list all of the elements whose index is between fromIndex and toIndex
        groceryList.subList(1,3);


        // foreach method: we can do stuff with it.
        groceryList.forEach( (element)-> System.out.println(element) );

        //----------------------------------------------
        // Returns an iterator over the elements in this list in proper sequence. it can only traverse the list in forward direction.
        // and can traverse map,set and list
        Iterator<String> iterator = groceryList.iterator();
        while (iterator.hasNext()){
            // do stuff
            System.out.println(iterator);
        }
        //----------------------------------------------

        // Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
        // => we can use this only for list
        // => can traverse both forward and reverse direction.
        // => we can also specify a starting index in case if we want to start traverse from a specific index
        ListIterator<String> listIterator = groceryList.listIterator();
        // to traverse the list we can use both hasnext() or hasPrevious() here, which we couldnt do in iterator

        //----------------------------------------------



        // Removes the first occurrence of the specified element from this list, if it is present.
        groceryList.remove("hello");
        //Removes the element at the specified position in this list.
        groceryList.remove(1);
        //Removes from this list all of its elements that are contained in the specified collection.
        groceryList.removeAll(Arrays.asList("hello", "hi"));
        //Removes all of the elements of this collection that satisfy the given predicate.
        groceryList.removeIf((element)-> element=="hi");

        //Removes from this list all of the elements whose index is between fromIndex and toIndex
        groceryList.subList(1,3).clear();

        // Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        // the typecasting can be rough though, have to study more about it.
        String[] arr =(String[]) groceryList.toArray();

        //Sorts this list according to the order induced by the specified Comparator.
        Collections.sort(groceryList);


    }
}
