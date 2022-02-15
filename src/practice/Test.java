package practice;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Integer a=5, b=6;
        Something.swapping(a,b);
        System.out.println(" a: " + a +" b: "+b);

        Scanner sc = new Scanner(System.in);

        System.out.println("Age: ");
        int age = sc.nextInt();
        System.out.println("Age = "+age);

        System.out.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Name = "+name);



    }
}

class Something{
    static void swapping(Integer a, Integer b){
        Integer temp = a;
        a=b;
        b=temp;
    }
}
