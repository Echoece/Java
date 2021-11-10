package Advanced.Concurrency.Threads;

public class AnotherThread extends Thread {
    public static final String ANSI_PURPLE = "\u001B[35m";
    @Override
    public void run(){
        System.out.println(ANSI_PURPLE+"Hello From Another Thread");
        for(int i=0; i <100; i++){
            System.out.print(ANSI_PURPLE+" "+i);
        }
    }
}
