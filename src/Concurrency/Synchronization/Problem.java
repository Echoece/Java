package Concurrency.Synchronization;
/* problem -> the i variable is instance variable of CountDown class, so i will be created inside the heap. when we made 2 thread and working on same instance of
   this class object, both thread will work on same copy of the i.
  */

class CountDown{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private int i;
    public void doCountDown(){
        /* this part is just visual,not important for logic. */
        String color;
        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color= CountDown.ANSI_CYAN;
                break;
            case "Thread 2":
                color = CountDown.ANSI_PURPLE;
                break;
            default:
                color=CountDown.ANSI_GREEN;
                break;
        }
        /* end of visual part, can skip reading this*/
        for (i=0;i<10;i++){
            System.out.println(color+ Thread.currentThread().getName()+" : i= "+i);
        }
    }
}

public class Problem {
    public static void main(String[] args) {
        CountDown count=new CountDown();
        // declaring the threads..............
        // 1) using anonymous class
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                count.doCountDown();
            }
        });
        t1.setName("Thread 1");
        // 2) using lambda
        Thread t2= new Thread( ()->count.doCountDown() );
        t2.setName("Thread 2");

        // starting the threads ................
        t1.start();
        t2.start();
    }

}
