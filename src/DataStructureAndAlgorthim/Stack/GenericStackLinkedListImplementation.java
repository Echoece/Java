package DataStructureAndAlgorthim.Stack;

import java.util.Iterator;

public class GenericStackLinkedListImplementation<Item>{
    private class Node{
        Item item;
        Node next;
    }
    private Node TopNode =null;

    public boolean isEmpty(){
        return TopNode ==null;
    }

    public void push(Item item){
        Node oldTopNode = TopNode;
        TopNode = new Node();
        TopNode.item = item;
        TopNode.next = oldTopNode;
    }
    public Item pop(){
        if(!isEmpty()){
            Item item = TopNode.item;
            TopNode = TopNode.next;
            return item;
        }
        return null;
    }
    public Iterator<Item> iterator (){
        return new ListIterator();
    }
    // implementing Iterable, only implemented two basic operation
    private class ListIterator implements Iterator<Item>{
        private Node current = TopNode;

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current= current.next;
            return item;
        }
    }
}
