package Module1;

public class CheckingAccount extends BankAccount {
    private double rate = 5;
    private int fee = 30;

    public CheckingAccount() {
        super();
    }
    
    public String processWithdrawal(double money) {
        /*
         * Withdraws money from account, but if balance is
         * under 0, then a fee is applied and interest is applied.
         */
        withdrawal(money);
        
        if (getBalance() < 0) {
            withdrawal(fee);
            return "Fee has been applied (overdraft)\n";
        }
        return "Withdrawal complete.\n";
    }

    public void displayAccount() {
        /*
         * Shows account summary with included interest rate.
         */
        accountSummary();
        System.out.println("\nInterest Rate: " + rate);
    }
}