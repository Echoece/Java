package Advanced.Concurrency.Runnables;

public class AnotherThread implements Runnable{
    public static final String ANSI_CYAN = "\u001B[36m";
    @Override
    public void run() {
        for(int i=0;i<100; i++){
            System.out.print(ANSI_CYAN+" "+i);
        }

    }
}
