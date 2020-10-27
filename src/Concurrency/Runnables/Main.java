package Concurrency.Runnables;
// steps :
// -> create object of the Thread class
// -> as a parameter of the thread class object, we pass an object of the class that we implement the runnable interface with.
// -> call the start method of the Thread class object(which will call the overridden run method).

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
        // creating a new thread
        Thread anotherThread = new Thread( new AnotherThread() );
        anotherThread.start();
        /* a shorter syntax, ( new Thread( new AnotherThread() ) ).start();*/

        // we can create an anonymous class instead of creating an extra class as well
        Thread anotherThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.print(ANSI_BLACK+" "+i);
                }
            }
        });
        anotherThread2.start();
        //doing stuff on main thread
        for(int i=0;i<100; i++){
            System.out.print(ANSI_BLUE+" "+i);
        }



    }
}
