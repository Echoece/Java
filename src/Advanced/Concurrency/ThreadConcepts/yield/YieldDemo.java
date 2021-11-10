package Advanced.Concurrency.ThreadConcepts.yield;


public class YieldDemo implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while(true){
            System.out.println("Thread: "+ ++count);
        }
    }
}

class Driver{
    public static void main(String[] args) {
        YieldDemo yieldDemo= new YieldDemo();
        Thread t1= new Thread(yieldDemo);
        int count = 0;

        t1.start();
        while (true){
            System.out.println("Main: "+ ++count);
            // if we keep code like this, then the thread count and main count should be very similar
            // in number, as they would get about same CPU time in each cycle (given they have same priority).

            Thread.yield();
            // by adding this, we are yielding the thread, so other thread will get more CPU time. If
            // we run now, the thread count should be much higher than main thread count.

            //Check output with and without yield to see the difference.
        }



    }
}
