package OOPConcepts.Polymorphism;

public class Overloading {
    // OverLoading can be done by:
    // 1) The number of parameters in two methods.
    // 2) The data types of the parameters of methods.
    // 3) The Order of the parameters of methods.

    // Also:
    // 1) the methods can or cant have different return type
    // 2) can or cant have different access modifier
    // 3) throw different checked or unchecked exception


    int a,b;

    // 1. constructor overloading
    public Overloading(int a) {
        this.a=a;
    }

    public Overloading(int a, int b) {
        this.a=a;
        this.b=b;
    }

    // 2. method overloading

    // this is a special case, since all the three have same number of arguments, in case we pass another type of parameter, for example
    // char, it will go to the next method which arguments bigger than char. in this case it will go to int. but if we pass a string it will throw an
    // error since nothing bigger than string data type is in the arguments.
    public void show(int a){
        System.out.println("int");
    }
    public void show(String a){
        System.out.println("string");
    }
    public void show(byte a){
        System.out.println("byte");
    }

    // we can have two or more static method same name, but different input parameter.
    public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }

    // we can even overload main() function in java, providing we give different arguments

}
