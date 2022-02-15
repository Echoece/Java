package Basics.operators;

public class CoarcionExample {
    public static void main(String[] args) {
            byte   b = 10;
            short  s = 15;
            int    i = 7;
            long   l = 50l;
            float  f = 12.5f;
            double d = 17.5d;
            char   c = 65;

        // any combination of short, byte or int will result in int data types.

        int a;
        a = b + s;    // byte + short  = int
        a = b + i;    // byte + int    = int
        a = s + i;    // int + short   = int


    }
}
