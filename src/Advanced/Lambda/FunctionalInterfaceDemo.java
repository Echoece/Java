package Advanced.Lambda;


public class FunctionalInterfaceDemo {
    public FunctionalInterfaceDemo(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {
        // 1. here the we are passing a reference to the println function, so the
        //    display method will act like println method.
        MyLambda myLambda= System.out::println;
        myLambda.display("Hi");

        // 2. we can reference static methods of class
        myLambda = FunctionalInterfaceDemo::reverse;
        myLambda.display("Hello");

        // 3. for non static methods, we need instance of that object
        myLambda = new FunctionalInterfaceDemo("hi")::nonStaticMethod;
        myLambda.display("Hello");

        // 4. But if we are using in the same class, we can get away with using this keyword from
        //    a non static method
        //    example: myLambda= this::nonStaticMethod;

        // 5. we can reference object constructor too
        myLambda= FunctionalInterfaceDemo::new;
        myLambda.display("Hello");

        // 6. in case of multiple parameters, its a bit complicated. this part yet to be studied fully.
        MyLambda2 myLambda2 = String::compareTo;
        System.out.println(myLambda2.display("hello","hello"));


    }

    public void nonStaticMethod(String str){
        System.out.println("from non static method : "+str);
    }

    public static void reverse(String str){
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }


}

@FunctionalInterface
interface MyLambda {
    void display(String str);
}

@FunctionalInterface
interface MyLambda2{
    int display(String str1, String str2);
}
