package Advanced.Exceptions.UserDefined;

public class MyException extends Exception {
    MyException(String str){
        super(str);
    }
}

class DriverClass{
    private static int accno[] = {1001, 1002, 1003, 1004};

    private static String name[] =
            {"Nish", "Shubh", "Sush", "Abhi", "Akash"};

    private static double bal[] =
            {10000.00, 12000.00, 5600.0, 999.00, 1100.55};

    public static void main(String[] args) {
        try {
            // display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" +
                    "\t" + "BALANCE");

            // display the actual account information
            for (int i = 0; i < 5; i++) {
                System.out.println(accno[i] + "\t" + name[i] +
                        "\t" + bal[i]);

                // display own exception if balance < 1000
                if (bal[i] < 1000) {
                    MyException myException =
                            new MyException("Balance is less than 1000");
                    throw myException;
                }
            }
        } catch (MyException e) {
            e.printStackTrace();

        }
    }
}
