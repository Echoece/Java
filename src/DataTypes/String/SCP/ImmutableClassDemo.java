package DataTypes.String.SCP;

public class ImmutableClassDemo<T> {
    private T i;

    public ImmutableClassDemo(T i) {
        this.i = i;
    }

    ImmutableClassDemo modify(T i){
        if(this.i == i)
            return this;

        return new ImmutableClassDemo(i);
    }

    public static void main(String[] args) {
        ImmutableClassDemo<Integer> immutableClassDemo = new ImmutableClassDemo(10);

        ImmutableClassDemo<Integer> immutableClassDemo1 = immutableClassDemo.modify(10);
        ImmutableClassDemo<Integer> immutableClassDemo2 = immutableClassDemo.modify(100);

        System.out.println(immutableClassDemo == immutableClassDemo1);      // true
        System.out.println(immutableClassDemo == immutableClassDemo2);      // false
    }
}
