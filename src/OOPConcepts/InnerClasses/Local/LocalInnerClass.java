package OOPConcepts.InnerClasses.Local;

class Outer {
    int x= 5;
    void outerMethod() {
        System.out.println("inside outerMethod");
        //-------------------------------
        // => Method local inner class can’t be marked as private, protected, static and transient
        //    but can be marked as abstract or final, but not both at the same time.
        class Inner {
            int x=6;
            void innerMethod() {
                System.out.println("inside innerMethod"+x);
            }
        }
        //--------------------------------
        Inner y = new Inner();
        y.innerMethod();
        System.out.println(x);
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer= new Outer();
        outer.outerMethod();
    }
}
