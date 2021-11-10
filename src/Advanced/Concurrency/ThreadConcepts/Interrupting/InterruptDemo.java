package Advanced.Concurrency.ThreadConcepts.Interrupting;

public class InterruptDemo implements Runnable{
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
        InterruptDemo interruptDemo= new InterruptDemo();
        Thread t1= new Thread(interruptDemo);

        t1.start();
        t1.interrupt();

    }
}
