package Concurrency.Synchronization;
// the solution to the problem class code is here. we just add the synchronized keyword on the method.
// now the threads cant access it randomly, have to wait for one thread to finish working for other thread
// to be active.


// another note : we could use synchronized on block/statement level as well here. in that case we can do
// something like this
/*
  synchronized(this){
    for (i=0;i<10;i++){
            System.out.println(color+Thread.currentThread().getName()+" i : "+i);
    }
  }
*/

class CountDownNew{
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
    synchronized public void doCountDown(){
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
            System.out.println(color+Thread.currentThread().getName()+" i : "+i);
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        CountDownNew countDownNew=new CountDownNew();
        //creating threads
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                countDownNew.doCountDown();
            }
        });
        t1.setName("Thread 1");
        Thread t2 = new Thread( ()->countDownNew.doCountDown()  );
        t2.setName("Thread 2");

        // starting the thread
        t1.start();
        t2.start();
    }


}
