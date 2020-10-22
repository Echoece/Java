package Static;

public class StaticMethod {
    // => static methods can't access instance method or variable directly ( instanced methods on the other hand can access static method+variable)
    // => in static method we cant use the keyword 'this'

    // usually when we have a method that doesnt use instance variables or method, that method should be declared as static
    // for example
    public static void PrintHello(){
        // here the method is independent, so no need to use it as a instance method. rather we are using static.
        System.out.println("hello");
    }
}

/*
    Define static methods in the following scenarios only:

       -> If you are writing utility classes and they are not supposed to be changed.
       -> If the method is not using any instance variable.
       -> If any operation is not dependent on instance creation.
       -> If there is some code that can easily be shared by all the instance methods, extract that code into a static method.
       -> If you are sure that the definition of the method will never be changed or overridden. As static methods can not be overridden
*/
