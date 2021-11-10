package DataStructureAndAlgorthim.Stack;

import java.util.Iterator;
import java.util.Objects;

public class GenericStackArrayImplementation<Item> {
    private Item[] stack;
    private int N=0;

    public GenericStackArrayImplementation(int size) {
        stack=(Item[]) new Objects[size];
        // here we have to cast, cause java doesnt support generic array creating. This leaves no choice but to use typecast.
    }
    public boolean isEmpty(){
        return N==0;
    }
    public void push(Item item){
        stack[N]=item;
        N++;
        // more elegant way stack[N++] = item;
    }

    public Item pop(){
        if(!isEmpty()){
            // elegant way, DataTypes.String item = stack[--N];
            Item item = stack[N-1];
            N--;
            stack[N] =null;  // to allow garbage collector to collect this
            return item;
        }
        else return null;
    }

    //implementing Iterable
    private class ReverseArrayIterator implements Iterator<Item>{
        private int i = N;
        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            return stack[--N];
        }
    }
}
