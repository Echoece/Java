package Exceptions.ThrowVsThrows;

public class ThrowExample {
    static void fun(){
        try{
            // throwing an exception here
            throw new NullPointerException();
        }catch (NullPointerException e){
            System.out.println("caught inside the fun() method");
            throw e;// throwing the exception again
        }
    }

    public static void main(String[] args) {
        try {
            fun();
        }catch (NullPointerException e){
            System.out.println("caught inside the main");
        }
    }
    /*
        Output ::
                caught inside the fun() method
                caught inside the main
    */
}
