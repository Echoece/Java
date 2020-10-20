package Interfaces;

// interfaces are used to standardize the way a particular set of classes are used, give them a common behaviour

// => interface cant implement method (abstract classes can, even though it wont be abstract method anymore)
// => a class can implement multiple interface, while can only inherit from one abstract class
// => interface is 100% abstract, while abstract classes can be 0-100% abstract  depending on their structure.
// => interfaces cant be instantiated, it can only be implemented by overriding its methods.
// => its methods are public abstract by default, the declaration on the interface was unnecessary, i just kept it for
//    memorization purpose.
// => to implement an interface , we must override all of its methods.
//----------------------------------------------------------------------
public class Main {


    public static void main(String[] args) {
        iTelephone myPhone= new Deskphone(1234);
        myPhone.powerOn();
        myPhone.callPhone(1234);
        myPhone.answer();
    }
}
