package AutoBoxing;
import java.util.ArrayList;
import java.util.List;
class IntClass{
    private int myValue;
    public IntClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class AutoBoxing {


    public static void main(String[] args) {
        // the following is an error because primitive types cant be the argument of arraylist, we need an object.
        // ArrayList<int> arrayList = new ArrayList<int>();

        // but if we do this, it works. basically it does same. but it is now storing 53 as object instead of a primitive type int.
        List<IntClass> list= new ArrayList<IntClass>();
        list.add(new IntClass(53));
        // so for these reasons it would be nice if we could use those primitive data types as objects as well. thats what autoboxing is all about.



        //-----------------------------------------------------------------------------
        int num=24; //Primitive data type
        @SuppressWarnings("deprecation")  // added to avoid the warning, i wrote the depricated version to understand how it works

        Integer intNum=new Integer(num); //Wrapping or Boxing, right way is , Integer intNum = 24;
        int anotherNum= intNum.intValue(); //Unwrapping or Unboxing, right way is , int anotherNum = intNum;
        Integer number=num; //Autoboxing or Auto Wrapping




    }
}
