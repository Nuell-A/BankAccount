package Module1;

public class BankAccount {
    /*
     * This class contains attributes, getters/setters, deposit/withdraw, balance, & summary
     */
    private String first_name, last_name;
    private int account_id;
    private double balance;

    // Initialize balance
    public BankAccount() {
        balance = 0;
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
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public int getAccountID() {
        return account_id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        balance += money;
    }

    public void withdrawal(double money) {
        balance -= money;
        }

    public void accountSummary() {
        /*
         * Shows account summary
         */
        System.out.println("Account Summary:");
        System.out.printf("\n%15s %15s %15s %15s", "ID", "First Name", "Last Name", "Balance");

        System.out.printf("\n%15s %15s %15s %15s", account_id, first_name, last_name, balance);
    }
}

