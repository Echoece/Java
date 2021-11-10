package Advanced.RegularExpression;

public class RegExDemo {
    public static void main(String[] args) {
        // 1. DataTypes.String demo
        String str= " I am a DataTypes.String, Yes, I am";
        String strNew= str.replaceAll("I","You");
        System.out.println(strNew);

        // 2. RegEx demo
        String name ="hello";
        System.out.println(name.replaceAll("[^he]","y"));
    }
}
