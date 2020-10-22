package InnerClasses.Nested;

class Outer {
    private int x=5;
    private void mm(){
        System.out.println("private method");
    }
    //-----------------------------
    class Inner{
        //=> can access any private instance variable/method of outer class.
        //=> we cant have any static method in nested inner class
        public void show(){
            System.out.println("Nested Inner class");
            System.out.println(x);
            mm();
        }
    }
    //------------------------------
}


public class NestedInnerClass {
    public static void main(String[] args) {
        Outer.Inner innerClass = new Outer().new Inner();
        innerClass.show();
    }
}

