package Static;

public class StaticVariables {
    // every instance of the class shares the same static variable, there is only one copy of it in memory. and all instance of class share that
    // same variable
    private static String name ;

    public StaticVariables(String name) {
        // we cant actually use this.name in this case , because the variable is static.
        StaticVariables.name = name;
    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        StaticVariables dog= new StaticVariables("Dog");
        StaticVariables cat = new StaticVariables("cat");
        // in here both will print the name cat, because only one instance of static variable is avaialable, and when we create the 2nd instance
        // and change the name to cat, the first dog name is changed too.
        dog.printName();
        cat.printName();
    }
}

