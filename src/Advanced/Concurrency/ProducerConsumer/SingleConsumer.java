package Advanced.Concurrency.ProducerConsumer;

public class SingleConsumer {
    public static void main(String[] args) throws InterruptedException {
        MyData data=new MyData();

        Producer p=new Producer(data);
        Consumer c=new Consumer(data);

        p.start();
        c.start();

    }
}


// shared resource object
class MyData
{
    int value;
    boolean flag=true;

    synchronized public void set(int v)
    {
        while(!flag)
            try {wait();}catch(Exception e){}

        value=v;
        flag=false;
        notify();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public int get()
    {
        int x=0;
        while(flag)
            try {wait();}catch(Exception e){}


        x=value;
        flag=true;
        notify();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return x;
    }
}

class Producer extends Thread
{
    MyData data;

    public Producer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    MyData data;

    public Consumer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}
