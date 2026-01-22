public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount <=0){
            throw  new IllegalArgumentException("Amount must be positive");
        }
        balance +=amount;
    }
    public void withdraw(double amount){
        if(amount <=0){
            throw  new IllegalArgumentException("Amount must be positive");
        }
        if(amount > balance){
            throw  new IllegalArgumentException("Insufficient funds");
        }
        balance-=amount;
    }
}
