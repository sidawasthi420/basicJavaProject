public class Bankdetails {

    private String accountHolder;
    private double bankbalance;

    String getaccountHolder() {
        return accountHolder;
    }

    double getbankbalance() {
        return bankbalance;
    }

    public void Setvalues(String name, double amount) {
        accountHolder = name;
        if(amount>=0){
            bankbalance = amount;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            bankbalance = bankbalance + amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= bankbalance) {
            bankbalance = bankbalance - amount;
        }
    }

    public static void main(String[] args) {
        Bankdetails account = new Bankdetails();
        account.Setvalues("Mukul", 1000.00);
        System.out.println("Account Holder: " + account.getaccountHolder());
        System.out.println("Bank Balance: " + account.getbankbalance());

        account.deposit(500.00);
        System.out.println("After deposit, Bank Balance: " + account.getbankbalance());

        account.withdraw(200.00);
        System.out.println("After withdrawal, Bank Balance: " + account.getbankbalance());
    }
}
