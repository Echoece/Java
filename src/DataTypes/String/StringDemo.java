package DataTypes.String;

public class StringDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer= new StringBuffer(".............");
        StringBuilder stringBuilder = new StringBuilder("....");
        char[] charArray = {'a','y','e'};
        byte[] byteArray = {67, 73, 77};

        String sss1 = new String("Hello World") ;
        String sss2 = new String("Hello World") ;

        System.out.println("testing: "+sss1.equals(sss2));
        // constructors of DataTypes.String class

        String s1 = new String();                               // empty DataTypes.String object
        String s2 = new String("DataTypes.String literal");        //
        String s3 = new String(stringBuffer);                   //
        String s4 = new String(stringBuilder);                  //
        String s5 = new String(charArray);                      //
        String s6 = new String(byteArray);                      //

        // important methods
        char a = s2.charAt(3);                          // throws indexOutOfBoundException if index more than string size.

        int index = s2.indexOf('a');                      // returns -1 if not available, returns the first occurrence.
        int lastIndex = s2.lastIndexOf('a');          // returns last occurrence index

        String a1 = s2.concat(" concat DataTypes.String part");

        boolean isEqual = s2.equals("DataTypes.String literal");  // checks for content equality, as DataTypes.String class overwrite the object.equal method (this checks for address/reference equality));
        boolean isEqual2 = s2.equalsIgnoreCase("string LITERAL");

        boolean isEmpty = s2.isEmpty();

        int length = s2.length();           // only for arrays, there is length property. But for DataTypes.String there is length method.

        String a2 = s2.replace('S','B');

        String a3 = s3.substring(2);        // throws indexOutOfBoundException if begin index > length of DataTypes.String
        String a4 = s3.substring(2,7);      // returns a substring from start index to (end-1) index.

        s3.toLowerCase();
        s3.toUpperCase();

        String a5= s3.trim();               // removes leading and trailing string.

        // special case
        // case 1:
        System.out.println(" ".equals("") + " and " + " ".isEmpty() );   // both will be false

        // case 2:
        System.out.println("Hello world".trim().length());      // 11


    }
}
