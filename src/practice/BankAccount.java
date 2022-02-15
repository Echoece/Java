package practice;

public class BankAccount {
    private String userName;
    private int id;
    private float balance;

    public BankAccount(String userName, int id, float balance) {
        this.userName = userName;
        this.id = id;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if(this.balance - balance >=0)
            this.balance = balance;
    }
}
