package DataTypes.WrapperClasses;

public class WrapperClassExample {
    public static void main(String[] args) {
        /* different ways to declare wrapper class*/

        //Integer integer = new Integer(10);
        //Integer integer = Integer.valueOf(10);  // we can add string value here as well

        Integer integer = 10;
        Byte b = Byte.valueOf("15");
        Short s = Short.valueOf("123");
        Float f = Float.valueOf("123.5");
        Double d = Double.valueOf(123.555);
        Character c = Character.valueOf('A');
        Boolean bool = Boolean.valueOf("True");

        // Boolean
        Boolean.logicalAnd(bool, true); // returns logical and of two boolean values, have methods for Or,Xor too
        Boolean.compare(bool, true);        // two type of compare, check the return values
        bool.compareTo(false);
        bool.toString();                    // returns string representation
    }
}
