package OOPConcepts.Polymorphism;

import java.util.LinkedList;
import java.util.List;


public class SubclassPolymorphism {
    public static void main(String[] args) {
        // linked list will have access to all the methods from list as well as linked list framework
        LinkedList<String> linkedList = new LinkedList<>();
        // list will have access to all the methods from list framework, but wont be able to access methods which are available in linkedlist only.
        List<String> list = new LinkedList<>();

        // but using the 2nd approach is way better if code allows it. for example , if we have an abstract class defining a method with
        // subclass polymorphism, we can actually  implement the method later with other classes that implements list interface.
        // for example, if another class implements this, i can assign list= new ArrayList<>(); and code will still work while have 2 classes
        // implementing two different data structure.
        // more on this here https://stackoverflow.com/questions/1348199/what-is-the-difference-between-the-hashmap-and-map-objects-in-java


    }
}
