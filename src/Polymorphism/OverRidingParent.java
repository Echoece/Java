package Polymorphism;

public class OverRidingParent {
    void show()
    {
        System.out.println("Parent's show()");
    }

    //---------------------------------------
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }
    // but protected methods can be overridden
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
    //---------------------------------------
}
