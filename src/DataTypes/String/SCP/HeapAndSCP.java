package DataTypes.String.SCP;

public class HeapAndSCP {
    public static void main(String[] args) {
        // Heap and DataTypes.String constant pool (HCP):
        // case 1:
        String ss5= new String("Something");      // two object will be created -> one in heap + one in SCP
        String ss6= "Something";                         // one object will be created -> "Something" in SCP

        // case 2:
        String ss1= new String("Echo");          // total 3 objects will be created here. Two in heap for two new
        String ss2= new String("Echo");          // operator, and one in SCP as same copy will be reused.
        String ss3= "Echo";
        String ss4= "Echo";

        // case 3:
        String ss7= new String("Dhaka");        // head+ scp
        ss7.concat("Khulna");                          // scp (khulna), heap (Dhaka Khulna) <- Garbage collector
        String ss8= ss7.concat("Raja");                // scp (Raja), heap (Dhaka Raja)
        ss8.concat(" Bag");                            // scp (Bag), heap (Dhaka Bag) <- Garbage collector.

        System.out.println(ss5);                        //  Dhaka
        System.out.println(ss6);                        //  Dhaka Raja

        // case 4:

        String s1 = new String(
                "you cant change me");
        String s2 = new String(
                "you cant change me");       // 2 object in heap and 1 in SCP
        System.out.println(s1==s2);                 // false, == operator checks for reference/address equality


        String s3= "you cant change me";            // no new object will be created, existing one will be reused in SCP
        System.out.println(s1==s3);                 // false, s1 pointing to object in heap, s3 to SCP


        String s4= "you cant change me";
        System.out.println(s3==s4);                 // true, both pointing to same copy in SCP


        String s5="you cant" + "change me";         // special case: as both are constant, Advanced.JVM will perform this at compile
                                                    // time. so no new object will be created, it will point to SCP existing object.
        System.out.println(s4==s5);                 // true, both pointing to same copy in SCP


        String s6= "you cant ";                     // SCP one object
        String s7= s6+ "change me";                 // "Change me" in SCP, "you cant change me" in heap pointed by S7
        System.out.println(s4==s7);                 // false, s4 pointing to SCP and s7 pointing to heap.


        final String s8="you cant ";                // points to sane copy in SCP.
        String s9=s8+"change me";                   // special case: as s8 is final variable, it will be replaces and computed in compile time.
                                                    // so, the result will be " you cant change me" and s9 will point at existing copy in SCP
        System.out.println(s4==s9);                 // true, both are pointing to same object in SCP

        /*---------------------------------------------------------------------------*/
    }
}
