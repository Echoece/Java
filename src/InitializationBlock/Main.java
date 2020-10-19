package InitializationBlock;

public class Main {
    public static void main(String[] args) {
        InitializationBlock initializationBlock1= new InitializationBlock();
        initializationBlock1.printArray();

        InitializationBlock initializationBlock2= new InitializationBlock();
        initializationBlock2.printArray();

        System.out.println("");
        StaticInitializationBlock staticInitializationBlock1 =new  StaticInitializationBlock();
        StaticInitializationBlock staticInitializationBlock2 =new StaticInitializationBlock();

        staticInitializationBlock1.printArray();
        staticInitializationBlock2.printArray();


    }
}
