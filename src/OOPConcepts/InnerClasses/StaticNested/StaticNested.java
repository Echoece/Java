package OOPConcepts.InnerClasses.StaticNested;

// never actually seen this class being used anywhere so far, donno what its used for.
//

class Outer {
    private static void outerMethod() {
        System.out.println("inside outerMethod");
    }

    // A static inner class
    static class Inner {
        // this class can only access static member of parent class
        public static void main(String[] args) {
            System.out.println("inside inner class Method");
            outerMethod();
        }
    }

}
public class StaticNested {
    public static void main(String[] args) {
        // since its a static class , we dont need to instantiate an object of parent class.

        Outer.Inner staticNested = new Outer.Inner();
        // Outer.Inner innerClass = new Outer().new Inner(); // for non static/nested inner class

    }
}
