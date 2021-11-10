package DataStructureAndAlgorthim.Recursion;

public class SimpleExample {
    public static void main(String[] args) {
        int counter= 6;

        recursionDemo(counter);

        System.out.println(factorial(counter));
    }

    public static void recursionDemo(int counter){
        if(counter==0)
            return;
        counter--;

        // this line will be processed before the recursive call, so before going into new stack frame for new recursive
        // function call, this line will print current value.
        //System.out.println(counter);          output: 5 4 3 2 1 0

        recursionDemo(counter);

        // here this line will be processed after the recursive function calls done from the stack. As it is LIFO, the
        // output will come in LIFO fashion.
        //System.out.println(counter);          output: 0 1 2 3 4 5
    }


    public static int factorial(int number){
        if(number==1)
            return 1;
        return number*factorial(number-1);
        // -> 6 * factorial(5)
        // -> 6 * factorial(5 * factorial(4) )
        // -> 6 * factorial(5 * factorial( 4 * factorial(3) ))
        // -> 6 * factorial(5 * factorial( 4 * factorial( 3* factorial(2) ) ))
        // -> 6 * factorial(5 * factorial( 4 * factorial( 3* factorial(2* factorial(1) ) ) ))

        // result = factorial(1) = 0
    }
}
