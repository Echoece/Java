package Generics;
// => Generics means parameterized types. Using Generics, it is possible to create classes that work with different data types.
// => Generics adds  type safety feature.
// => Generics work only with Reference Types, it wont work with primitive type like int,float etc.

public class Generics <T, U>{
    T obj1;     // An object of type T
    U obj2;     // An object of type U

    // constructor
    Generics(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    // we could have return type as generic as well, for example public <T> foo(){ // return something}
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class Main
{
    public static void main (String[] args)
    {
        Generics <String, Integer> obj =
                new Generics<String, Integer>("GfG", 15);

        obj.print();
    }
}
