package Advanced.Exceptions.ThrowVsThrows;

public class ThrowsExample {
    public static void main(String[] args) throws ArithmeticException{
        try{
            int x = 1/0;
        }catch (ArithmeticException e){
            e.printStackTrace();;
        }

        System.out.println("next statement... , this will print if since we are catching the exception");
        //-----------------------------------------------------

        // but if we dont catch the exception
        int y= 1/0;
        // this line will not print
        System.out.println("Last statement... , this will not print cause we arnt catching the exception. only declaring it");
    }
}
