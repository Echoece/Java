package Collection.Arrays;
/*
  Even though technically not part of the collection class, i put it here for trying to keep package numbers minimum
*/

// => array is a data structure that allows us to store multiple values of the same type to a  single variable.
// => in java the default values are set to zero for numeric,false for boolean and null for string and other object elements.
//

// if we try to access index that is out of range, we get ArrayIndexOutOfBoundsException
public class Array {
    public static void main(String[] args) {

        int[] nums= new int[4];
        nums[0]=10;
        nums[1]=20;
        nums[3]=30;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        //---------------------------------------
        int[] numbers=new int[] {2,4,6,8,10};
        for(int number: numbers) {
            System.out.println(number);
        }
        int[] oddNumbers= {1,3,5,7,9};
        for(int odd: oddNumbers) {
            System.out.println(odd);
        }
        //--------------------------------------

        //2D Array

        int [][] myArray= {
                {2,4,6,8,7},
                {1,3,5,7,9},
                {7,3,8,3,2}
        };

        for(int arr[]: myArray) {
            for(int n: arr) {
                System.out.print(n);
            }
            System.out.println();
        }
        //--------------------------------------

        // Jagged Array: it is a multidimensional array of different sizes in each row
        int [][] jaggedArray= {
                {2,4,6,8,7},
                {1,3,5},
                {7,3,8,3,2}
        };

        for(int arr[]: jaggedArray) {
            for(int n: arr) {
                System.out.print(n);
            }
            System.out.println();
        }
        //--------------------------------------
    }
}
