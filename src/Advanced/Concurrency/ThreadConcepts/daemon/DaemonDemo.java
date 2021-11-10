package Advanced.Concurrency.ThreadConcepts.daemon;

public class DaemonDemo implements Runnable{
    @Override
    public void run() {
        int count = 0;
        while(true){
            System.out.println(++count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Driver{
    public static void main(String[] args) {
        DaemonDemo daemonDemo= new DaemonDemo();
        Thread t1= new Thread(daemonDemo);

        t1.setDaemon(true);
        t1.start();

        // since we set the thread as Daemon, it will work as a background thread and will end as
        // soon as main thread ends, even if its own task isn't complete.

    }
}



