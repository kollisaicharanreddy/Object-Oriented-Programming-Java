package Interface;

public class WalletPayment implements PaymentMethod{
    String walletName;
    WalletPayment(String walletName){
        this.walletName = walletName;
    }
    @Override
    public void pay(double amount){
        System.out.println("Paid Rs. " + amount + " using " + walletName + " wallet.");
    }
}
