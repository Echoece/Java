package Basics.TypeCasting;

public class JavaTypeCasting {
    public void typecast(){
        // we shouldnt typecast datatype which have bigger size into data types of smaller sizes. it will create bugs and erros in our code
        // int to float
        int myInt=850;
        System.out.println("declared int number" + myInt);
        float intToFloat=(float)myInt; // float intToFloat=myInt; is correct because their size is same
        System.out.println("Integer to Float: "+intToFloat);

        // int to double
        double intToDouble=(double)myInt; // double intToDouble=myInt; is correct because double have higher size than int.
        System.out.println("Integer to Double: "+intToDouble);

        // int to byte
        byte intToByte=(byte)myInt;   // its not good since we will get only the value as much as the bye can store, instead of the full int value.
        System.out.println("Integer to Byte: "+intToByte);

        // int to short
        short intToShort=(short)myInt;  // same problem as byte
        System.out.println("Integer to Short: "+intToShort);
        System.out.println("-------------------------------");

        //-----------------------------------------

        // char to int
        char myChar='8';
        System.out.println("declared char " + myChar);
        int charToInt=Integer.parseInt(String.valueOf(myChar));
        System.out.println("Character to Integer: "+charToInt);

        // char to double
        double charToDouble= Double.parseDouble(String.valueOf(myChar));
        System.out.println("Character to Double: "+charToDouble);

        // char to float
        float charToFloat= Float.parseFloat(String.valueOf(myChar));
        System.out.println("Char to Flaot: "+charToFloat);

        // char to byte
        byte charToByte= Byte.parseByte(String.valueOf(myChar));
        System.out.println("Char to Byte: "+charToByte);

        // char to short
        short charToShort= Short.parseShort(String.valueOf(myChar));
        System.out.println("Char to Short: "+charToShort);

        // char to string
        String charToString= Character.toString(myChar);
        System.out.println("Char to DataTypes.String: "+charToString);
        System.out.println("-------------------------------");

        //------------------

        // DataTypes.String to int
        String num="68";
        System.out.println("declared string " + num);
        int stringToInt=Integer.parseInt(num);
        System.out.println("DataTypes.String to Integer: "+stringToInt);

        // DataTypes.String to byte
        byte stringToByte=Byte.parseByte(num);
        System.out.println("DataTypes.String to Byte: "+stringToByte);

        // DataTypes.String to short
        short stringToShort= Short.parseShort(num);
        System.out.println("DataTypes.String to Short: "+stringToShort);

        // DataTypes.String to float
        float stringToFloat= Float.parseFloat(num);
        System.out.println("DataTypes.String to Float: "+stringToFloat);

        // DataTypes.String to Long
        long stringToLong= Long.parseLong(num);
        System.out.println("DataTypes.String to Long: "+stringToLong);
        System.out.println("-------------------------------");

        //-------------------------------------

        // int to DataTypes.String
        int intNumber=698;
        System.out.println("declared int number" + intNumber);
        String intToString=Integer.toString(intNumber);
        System.out.println("int to DataTypes.String: "+intToString);

        // float to DataTypes.String
        float floatNumber=3564.67f;
        System.out.println("declared float number" + floatNumber);
        String floatToString= Float.toString(floatNumber);
        System.out.println("float to DataTypes.String: "+floatToString);

        // double to DataTypes.String
        double doubleNumber=34637.89;
        System.out.println("declared double number" + doubleNumber);
        String doubleToString= Double.toString(doubleNumber);
        System.out.println("double to DataTypes.String: "+doubleToString);
    }
}
