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
