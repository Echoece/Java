package Basics.AccessModifier;

public class AccessModifier {
    // public :: public class member can be accessed from any class anywhere,even in different package.

    // private :: the object is only visible within the class, it is not visible anywhere else.

    // protected :: the object is visible everywhere in its own package, but  also in subclasses from different package as well.

    // package-private/default :: its visible everywhere in same package but not to classes in external package (even not for subclasses).


    //final ::
    //  -> You can initialize a final variable when it is declared.This approach is the most common.
    //  -> A final variable is called blank final variable,if it is not initialized while declaration.

    //  Below are the two ways to initialize a blank final variable.
    //    -> A blank final variable can be initialized inside instance-initializer block or inside constructor. If you have
    //       more than one constructor in your class then it must be initialized in all of them, otherwise compile time error will be thrown.
    //    -> A blank final static variable can be initialized inside static block.

}
