package practice;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void change(int age){
        age= age +10;
    }
    Person cloning(){
        return new Person(this.name,this.age);
    }

    @Override
    public String toString() {
        return "name: "+this.name+ " age: "+this.age;
    }
}
