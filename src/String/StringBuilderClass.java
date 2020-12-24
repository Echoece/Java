package String;
// this class is an alternative to string class for working with string class.String class is immutable(cant change its internal state) while stringbuilder
// class is mutable. There is a similar synchronized class named StringBuffer (rarely used, used in multi-threaded applications)

/* Disadvantage of string class:
    1.does not allow appending. Each time we do, it creates a new object and returns it.
    2.String class is way slower than string builder
*/
public class StringBuilderClass {
    public static void main(String[] args) {
        // create a StringBuilder object
        // usind StringBuilder() constructor
        StringBuilder str = new StringBuilder();
        str.append("GFG");
        // print string
        System.out.println("String = " + str.toString());

        // create a StringBuilder object
        // usind StringBuilder(CharSequence) constructor
        StringBuilder str1 = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String1 = " + str1.toString());

        // create a StringBuilder object
        // usind StringBuilder(capacity) constructor
        StringBuilder str2 = new StringBuilder(10);

        // print string
        System.out.println("String2 capacity = " + str2.capacity());

        // create a StringBuilder object
        // usind StringBuilder(String) constructor
        StringBuilder str3 = new StringBuilder(str1);

        // print string
        System.out.println("String3 = " + str3.toString());
    }
}
