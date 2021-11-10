package designPattern.creational;

import java.io.IOException;

// this is basically one level higher abstraction than factory pattern.
public class AbstractFactoryDemo {
    public static void main(String args[])throws IOException {
        String bankName="SFC";
        String loanName="home";

        // step 1:  we are getting a bank-factory from Factory creator (two choices: bank-factory and loan-factory)
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");

        // step 2:  we are getting a bank from bank factory
        Bank b=bankFactory.getBank(bankName);

        // similar 2 step in case we want to get loan factory.
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan(loanName);
    }
}

// this class have static method getFactory which returns a new instance of Bank
// or Loan factory (both are also factory)
class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}
/*------------------------------------------------*/
// abstract factory and its its implementations
abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}

class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}

class LoanFactory extends AbstractFactory{
    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }
}

/*------------------------------------------------*/


/*------------------------------------------------*/
// abstract class and its implementation of Bank
interface Bank{
    String getBankName();
}

class HDFC implements Bank{
    private final String bankName;
    public HDFC(){
        bankName ="HDFC BANK";
    }
    public String getBankName() {
        return bankName;
    }
}

class ICICI implements Bank{
    private final String bankName;
    ICICI(){
        bankName ="ICICI BANK";
    }
    public String getBankName() {
        return bankName;
    }
}


class SBI implements Bank{
    private final String bankName;
    public SBI(){
        bankName ="SBI BANK";
    }
    public String getBankName(){
        return bankName;
    }
}

/*------------------------------------------------*/
// abstract class and its implementation of Loan

abstract class Loan{
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanamount, int years)
    {
        /*
              to calculate the monthly loan payment i.e. EMI

              rate=annual interest rate/12*100;
              n=number of monthly installments;
              1year=12 months.
              so, n=years*12;

            */

        double EMI;
        int n;

        n=years*12;
        rate=rate/1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;

        System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");
    }
}

class HomeLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }
}

class BussinessLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }

}

class EducationLoan extends Loan{
    public void getInterestRate(double r){
        rate=r;
    }
}
/*------------------------------------------------*/

