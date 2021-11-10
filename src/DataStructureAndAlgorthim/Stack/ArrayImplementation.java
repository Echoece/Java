package DataStructureAndAlgorthim.Stack;

// it have issue with stack overflow when the size exceeds capacity. we have to specify that in the implementation
public class ArrayImplementation {
    private String[] stack;
    private int N=0;

    public ArrayImplementation(int size) {
        stack= new String[size];
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
            return item;
        }
        else return null;
    }
}
