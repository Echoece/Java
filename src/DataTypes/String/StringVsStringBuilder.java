package DataTypes.String;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        /*---------------------------------------------------------------------------*/
        // 1. Explain mutability and immutability with an example.

        String s1= new String("Echo");
        s1.concat("is a good boy");
//        System.out.println(s1);

        StringBuffer s2= new StringBuffer("Echo");
        s2.append(" is a good boy");
//        System.out.println(s2);
        // question: What is the result here in the above code?

        // answer:
        // -> for DataTypes.String s1 output is -> Echo. The concat operation will return an new instance of DataTypes.String.
        //    And since we arnt assigning that instance to any variable. As a result it will be available
        //    for garbage collector.

        // -> for StringBuffer output is -> Echo is good boy. Since this class is mutable, the append will
        //    append the text with the s2 object and changes will persist there.

        /*---------------------------------------------------------------------------*/


        // 2. Explain the difference of .equals method and == operator with an example.

        String s3= new String("echo");
        String s4= new String("echo");
        StringBuffer sb1= new StringBuffer("echo");
        StringBuffer sb2= new StringBuffer("echo");

        System.out.println(s3==s4);                     // false
        System.out.println(s3.equals(s4));              // true

        System.out.println(sb1==sb2);                   // false
        System.out.println(sb1.equals(sb2));            // false  -> check notes question 2.

        /*---------------------------------------------------------------------------*/




    }
}
