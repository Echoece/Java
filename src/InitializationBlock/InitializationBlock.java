package InitializationBlock;

public class InitializationBlock {
    //Initialization blocks are executed whenever the class is initialized and before constructors are invoked.
    //They are typically placed above the constructors within braces.
    //It is not at all necessary to include them in your classes.
    static int[] numArray= new int[10];

    // initialiation block
    {
        System.out.println("Starting the initialization block");
        for(int i=0;i <10 ; i++){
            numArray[i] = (int) ( 100* Math.random() );
        }
    }

    public InitializationBlock() {
        System.out.println("Starting the constructior");
    }

    void printArray() {
        System.out.println("The initialized values are:");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println("\n-------------------------");

    }

}
