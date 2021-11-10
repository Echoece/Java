package practice;


public class Test {
    public static void main(String[] args) {
        Integer a=5, b=6;
        Something.swapping(a,b);
        System.out.println(" a: " + a +" b: "+b);

    }
}

class Something{
    static void swapping(Integer a, Integer b){
        Integer temp = a;
        a=b;
        b=temp;
    }
}
