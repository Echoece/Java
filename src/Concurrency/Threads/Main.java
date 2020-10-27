package Concurrency.Threads;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED+"Hello From Main Thread");

        // creating a new thread
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        System.out.println(ANSI_RED+"Hello Again From Main Thread");

        // instead of creating a class we can use anonymouse class,
        new Thread(){
            public void run(){
                for(int i=100; i <200; i++){
                    System.out.print(ANSI_YELLOW+" "+i);
                }

            }
        }.start();

        // we can replace this with lambda expression
        new Thread(()->System.out.println(ANSI_CYAN+"Hello From Lambda expression")).start();
    }
}
