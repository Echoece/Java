package Basics.ConditionalStatements;

public class ConditionalStatement {
    // we have basically if-else, switch-case and ternary expression for conditional statement. We also have jump
    // conditions - break, continue and return

    /* Ternary expressions are good for situations where we need just one condition
       evaluated (which happens a lot of time in practical codes). */

    // Switch is more efficient than a nested if in cases when there is one condition to evaluate a fixed data value.

    // break - is used to 1) terminate a sequence in switch statement, 2) exit a loop
    // continue - is used to force an early iteration of the loop, skipping the remaining code.
    // return - this is used to explicitly return from a method. basically it exit the method and returns any value if specified.

    public void ternaryIOperator() {
        // condition ? expression1 : expression2;
        // if condition is true first expression is executed , if false second.
        int num1=14, num2=10;
        int result=(num1>num2)? num1:num2;
        System.out.println("larger number: "+result);
    }

    public void gradeCalculate() {
        // Expression can be of type byte, short, int, char,string or an enum.
        // we need to be careful of using break; statement here. because without the break the code will continue to run
        // and go to next case, and will give results that are not desired.
        int mark=100;
        switch(mark) {
            case 33:
                System.out.println("D");
                break;
            case 40:
                System.out.println("C");
                break;
            case 50:
                System.out.println("B");
                break;
            case 60:
                System.out.println("A-");
                break;
            case 70:
                System.out.println("A");
            case 80: case 90: case 100:
                System.out.println("A+");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
