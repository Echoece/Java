package Interfaces;

// interfaces are used to standardize the way a particular set of classes are used, give them a common behaviour. it gives the program abstraction
// which hides away complex working of the system and only give a blueprint of the system.

// => interface cant implement method (abstract classes can, even though it wont be abstract method anymore)
// => a class can implement multiple interface, while can only inherit from one abstract class
// => interface is 100% abstract, while abstract classes can be 0-100% abstract  depending on their structure.
// => interfaces cant be instantiated, it can only be implemented by overriding its methods.
// => all variables are final static
// => its methods are public abstract by default, the declaration on the interface was unnecessary, i just kept it for
//    memorization purpose.
// => to implement an interface , we must override all of its methods.

//----------------------------------------------------------------------
public class Main {


    public static void main(String[] args) {
        // myphone is a reference of interface type
        iTelephone myphone;
        // now we creating a desktop object
        myphone= new Deskphone(1234);
        myphone.powerOn();
        myphone.callPhone(1234);
        myphone.answer();
        // because we created a reference type of interface, now we can also assign it to a mobile phone object
        myphone = new MobilePhone(123);
        myphone.powerOn();
        myphone.callPhone(123);
        myphone.answer();
    }
}
