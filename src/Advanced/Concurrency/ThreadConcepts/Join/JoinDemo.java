package Advanced.Concurrency.ThreadConcepts.Join;



public class JoinDemo implements Runnable{
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
    public static void main(String[] args) throws InterruptedException {
        JoinDemo joinDemo= new JoinDemo();
        Thread t1= new Thread(joinDemo);

        t1.setDaemon(true);
        t1.start();

        // if we keep code like this, as soon as main thread ends, background thread (daemon thread)
        // will end too. If we dont want this behaviour. we will have to join the main thread.
        // Then it will wait for all other thread to finish.

        t1.join();

    }
}

