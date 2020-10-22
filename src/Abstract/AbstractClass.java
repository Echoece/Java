package Abstract;
// there is two ways of achieve abstraction in java, interface (100% ) abd abstract class(0-100% abstraction). abstract
// classes, like interface Provide a common interface which allows the subclass to be interchanged with all other subclasses.
// only difference is , we can specify some method and variables which we couldnt do in interface.

// same rule as interface, if we inherit from an abstract class we must provide the override. If it doesnt , then the inherited class
// must be declared abstract as well.

// when to use abstract class instead of interface :
// -> in case we need non static or non final fields
// -> in case when require access modifier other than public
// -> in case where we can provide a default partial implementation of base class, while leaving abstract methods to be overridden by child.

// Rule of thumb :
// -> If the class has few abstract methods and few concrete methods, declare it as an abstract class.
// -> If the class has only abstract methods, declare it as an interface.

//---------------------------

// =>  An abstract class is a class which cannot be instantiated
// =>  An abstract class may or may not contain abstract methods.There can be no abstract methods.
//     ( An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon) )
// =>  If a class has at least one abstract method then that class must be abstract
// =>  an abstract class can contain constructors in Java. And a constructor of abstract class is called when an instance of a inherited class is created


abstract class Base {
    abstract void fun();
}
class Derived extends Base {
    void fun() { System.out.println("Derived fun() called"); }
}
public class AbstractClass {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}
