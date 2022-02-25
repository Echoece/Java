package OOPConcepts.Polymorphism;

public class OverRidingChildren extends OverRidingParent {

    // rules :
    // => it must have same name + argument
    // => return type can be subclass of the return type in parent class
    // => we cant override static method.
    // => we cant override final method.
    void show()
    {
        System.out.println("Children's show()");
        // => we can call parent's overridden method using super keyword
        super.show();
    }
    //----------------------------------
    // => we can override the access modifier for the methods as well, as long as we give the access modifier more access instead of less.for example,
    //    we can make a protected method from parent class public.
    // => However we cant change private methods.for example,

    // new m1() method different from the parent m1() method.
    // unique to Child class
    private void m1()
    {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }

    //----------------------------------
}
