package Module1;

public class BankAccount {
    /*
     * This class contains attributes, getters/setters, deposit/withdraw, balance, & summary
     */
    private String first_name;
    private String last_name;
    private int account_id;
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void setFirstName(String f) {
        this.first_name = f;
    }

    public void setLastName(String l) {
        this.last_name = l;
    }

    public void setAccountID(int id) {
        this.account_id = id;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public int getAccountID() {
        return this.account_id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdrawal(double money) {
        if (money > getBalance()) {
            CheckingAccount.processWithdrawal(money);
        }
        else {
        this.balance -= money;
        }
    }

    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.printf("\n%15s %15s %15s %15s", "ID", "First Name", "Last Name", "Balance");

        System.out.printf("\n%15s %15s %15s %15s", this.account_id, this.first_name, this.last_name, this.balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(45.30);
        System.out.println(ba.getBalance());

        ba.withdrawal(10);
        
        ba.setAccountID(1);   
        ba.setFirstName("Emanuel");
        ba.setLastName("Alcala");

        ba.accountSummary();
    }
}

