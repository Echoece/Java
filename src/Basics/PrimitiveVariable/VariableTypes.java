package Basics.PrimitiveVariable;

public class VariableTypes {
    public void VariableTypes(){
        //Byte
        byte myByte=100;
        System.out.println("byte number: "+myByte);
        System.out.println("Maximum value of Byte: "+Byte.MAX_VALUE); // 127
        System.out.println("Minimum value of Byte:"+Byte.MIN_VALUE); // -128
        System.out.println("Size of Byte: "+Byte.SIZE+" bits");      // 8 bit or 1 byte
        System.out.println("-------------------------------");

        //Short
        short myShort=2;
        System.out.println("byte number: "+myShort);
        System.out.println("Maximum value of Short: "+Short.MAX_VALUE);  // 32767
        System.out.println("Minimum value of Short: "+Short.MIN_VALUE);  // -32768
        System.out.println("Size of Short: "+Short.SIZE+" bits");        // 16 bit or 2 byte
        System.out.println("-------------------------------");

        //Integer
        int myInt=1300;
        System.out.println("short number: "+myInt);
        System.out.println("Maximum value of Integer: "+Integer.MAX_VALUE); // 2147483647
        System.out.println("Minimum value of Integer: "+Integer.MIN_VALUE); // 2147483648
        System.out.println("Size of Integer: "+Integer.SIZE+" bits");       // 32 bits or 4 byte
        System.out.println("-------------------------------");

        //Float
        float myFloat=820.5f;
        System.out.println("float number: "+myFloat);
        System.out.println("Maximum value of Float: "+Float.MAX_VALUE);  // 3.4028235 E-38
        System.out.println("Minimum value of Float: "+Float.MIN_VALUE);  // 1.4 E-45
        System.out.println("Size of Float: "+Float.SIZE+" bits");        // 32 bits or 4 byte
        System.out.println("-------------------------------");

        //Double
        double myDouble=89057.4617457;
        System.out.println("double number: "+myDouble);
        System.out.println("Maximum value of Double: "+Double.MAX_VALUE);  // 1.7976931348623157 E-308
        System.out.println("Minimum value of Double: "+Double.MIN_VALUE);  // 4.9 E-324
        System.out.println("Size of Double: "+Double.SIZE+" bits");        // 64 bits or 8 byte
        System.out.println("-------------------------------");

        //Long
        long myLong=325485754798741L;
        System.out.println("long number: "+myLong);
        System.out.println("Maximum value of Long: "+ Long.MAX_VALUE);  // 9223372036854775807
        System.out.println("Minimum value of Long: "+ Long.MIN_VALUE);  // -9223372036854775808
        System.out.println("Size of Long: "+Long.SIZE+" bits");         // 64 bits or 8 byte
        System.out.println("-------------------------------");

        //Char
        char myChar='x';
        System.out.println("this is a character: "+myChar);
        System.out.println("-------------------------------");

        //DataTypes.String
        String myName="Rafiqul Islam";
        System.out.println("My name is: "+myName);
        System.out.println("-------------------------------");
    }
}
