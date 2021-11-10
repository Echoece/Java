package designPattern.creational;

public class SingletonDemo {
    public static void main(String[] args) {
        A singletonA = A.getA();
        B singletonB = B.getB();
    }
}


// early initialization
class A {
    private static A obj = new A(); //Early, instance will be created at load time, and static member will hold only one copy

    private A() {
    }   // private constructor, so creating object instance is not possible.


    // returning an object
    public static A getA() {
        return obj;
    }

    public void doSomething() {
        // some task code here
    }
}

// lazy initialization
class B {
    private static B obj=null;

    private B() {
    }

    public static B getB() {
        if (obj == null) {
            obj = new B();//instance will be created at request time
        }
        return obj;
    }

    public void doSomething() {
        //some task code here
    }
}
