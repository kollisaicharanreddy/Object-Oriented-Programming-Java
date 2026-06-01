package Interface;

public class Main {
    public static void main(String[] args){
        PaymentMethod p1 = new CreditCardPayment("1234567812345678");
        PaymentMethod p2 = new UpiPayment("charan@oksbi");
        PaymentMethod p3 = new WalletPayment("Paytm");
        
        PaymentMethod[] payments = {p1, p2, p3};
        
            payments[0].pay(5000);
            payments[1].pay(1000);
            payments[2].pay(750);
        
    }
    
}
