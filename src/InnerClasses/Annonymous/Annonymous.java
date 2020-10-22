package InnerClasses.Annonymous;
// => An anonymous class must always extend a super class or implement an interface but it cannot have an explicit extends or implements clause.
// => An anonymous class must implement all the abstract methods in the super class or the interface.
// => An anonymous class always uses the default constructor from the super class to create an instance.

public class Annonymous {
    public static void main(String[] args) {
        // case 1 : For Overriding(Sub classing) ,When class definition is not usable except current case
        A a = new A() {
            public void methodA() {
                System.out.println("anonymous methodA");
            }
        };
        //--------------------------------------

        // case 2 : For implementing an interface,When implementation of interface is required only for current case
        interfaceA i = new interfaceA() {
            public void methodA() {
                System.out.println("anonymous methodA implementer");
            }
        };
        //--------------------------------------

        // case 3: Argument Defined Anonymous inner class:
        B b = new B();
        b.method(new Foo() {
            public void methodFoo() {
                System.out.println("methodFoo");
            }
        });
        //--------------------------------------

    }
}

// class for case 1
class A{
    public void methodA() {
        System.out.println("methodA");
    }
}
//------------------------

// interface for case 2
interface interfaceA{
    public void methodA();
}
//------------------------


// for case 3
interface Foo {
    void methodFoo();
}
class B{
    void method(Foo f) { }
}
//------------------------
