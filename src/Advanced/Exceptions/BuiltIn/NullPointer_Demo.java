package Advanced.Exceptions.BuiltIn;
class foo{
    int age;
}
public class NullPointer_Demo {
    public static void main(String args[])
    {
        try {
            foo a=null; //null value
            System.out.println(a.age);
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
}
