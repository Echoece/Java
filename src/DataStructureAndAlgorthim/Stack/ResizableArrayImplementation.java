package DataStructureAndAlgorthim.Stack;
// this fixes the problem of the previous array implementation, where users had to provide the array size.
// in this case we will increase the size of the array when its full by doubling it.

// this is the better solution than the casual array implementation.


public class ResizableArrayImplementation {
    private String[] stack;
    private int N=0;

    public ResizableArrayImplementation() {
        stack= new String[1];
    }
    public boolean isEmpty(){
        return N==0;
    }
    public void push(String item){
        stack[N]=item;
        N++;
        // more elegant way stack[N++] = item;
    }

    public String pop(){
        if(!isEmpty()){
            // elegant way, DataTypes.String item = stack[--N];
            String item = stack[N-1];
            N--;
            stack[N] =null;  // to allow garbage collector to collect this

            // here we resizing the array when its 25% full, since we dont want the array have too much extra space without any data.
            // the reason we doing it for 25% is that if we do it during 50% , and in that time users do push/pop consecutively it will
            // keep resizing the array and in turn copy operation that takes O(N) time.
            if(N>0 && N == stack.length/4)
                resize(stack.length/2);

            return item;
        }
        else return null;
    }
    private void resize(int capacity){
        String[] copy= new String[capacity];
        for (int i=0;i<stack.length;i++){
            copy[i]=stack[i];
        }
        stack=copy;
    }
}
