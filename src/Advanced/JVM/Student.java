package Advanced.JVM;

import java.lang.reflect.Method;

public class Student {
    private String name;
    private String roll;

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }
}

class Driver{
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> c= Class.forName("java.lang.String");
        Method[] m=c.getMethods();
        int count=0;
        for (Method element:m
             ) {
            count++;
            System.out.println(element.getName());
        }
        System.out.println("number of methods total: "+count);
    }
}
