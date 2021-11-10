package OOPConcepts.InitializationBlock;

public class StaticInitializationBlock {
    // static initialization blocks can only initialize the static instance variables. These blocks are only executed once when the class is loaded.
    // There can be multiple static initialization blocks in a class that is called in the order they appear in the program.
    static int[] numArray = new int[10];
    // here numArray will be only initialized once. after that rest of the objects that are instantiated from this class will share the array.
    static {
        System.out.println("Running static initialization block.");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (100.0 * Math.random());
        }
    }

    public StaticInitializationBlock() {
        System.out.println("Starting the Constructor");
    }

    void printArray() {
        System.out.println("The initialized values are:");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println("\n-------------------------");
    }

}
