package DataStructureAndAlgorthim.Stack;

public class LinkedListImplementation {
    private class Node{
        String item;
        Node next;
    }
    private Node TopNode =null;

    public boolean isEmpty(){
        return TopNode ==null;
    }

    public void push(String item){
        Node oldTopNode = TopNode;
        TopNode = new Node();
        TopNode.item = item;
        TopNode.next = oldTopNode;
    }
    public String pop(){
        if(!isEmpty()){
            String item = TopNode.item;
            TopNode = TopNode.next;
            return item;
        }
        return null;
    }
}
