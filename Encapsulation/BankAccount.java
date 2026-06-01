public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    String getAccountNumber(){
        return accountNumber;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    double getBalance(){
        return balance;
    }
    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args){
        BankAccount a1 = new BankAccount("ACC101", "Charan", 1000);
        a1.deposit(500);
        a1.withdraw(200);
        a1.withdraw(2000);
        a1.displayAccountDetails();
    }
}
