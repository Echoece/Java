package Advanced.ReflectionPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ExampleClass {
    private int id;
    protected int studentId;
    public int serial;
    int random;

    public ExampleClass() {
    }

    public ExampleClass(int id, int random) {
        this.id = id;
        this.random = random;
    }

    public void display(String s1, String s2){}
    public int show(int a,int b){return 0;}
}

class ReflectionDemo{
    public static void main(String[] args) {
        // Class represents the definition of any class. When we compile our program we get a class file for every class.
        // we can get the description of these classes as below.

        // first way
        Class c = ExampleClass.class;

        // second way
        ExampleClass exampleClass = new ExampleClass();
        Class c1 = exampleClass.getClass();

        // get name of the class
        System.out.println(c.getName());

        // get all fields
        Field[] fields = c.getDeclaredFields();
        for(Field f:fields)
            System.out.println(f);

        // get all constructor
        Constructor[] constructors = c.getConstructors();
        for(Constructor f:constructors)
            System.out.println(f);

        // get all methods
        Method[] methods = c.getMethods();
        for(Method f:methods)
            System.out.println(f);

        // get all parameters
        Parameter[] parameters = methods[0].getParameters();
        for(Parameter f:parameters)
            System.out.println(f);

    }
}
