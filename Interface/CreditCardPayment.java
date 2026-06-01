package Interface;

public class CreditCardPayment implements PaymentMethod{
    String cardNumber;
    CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. "+ amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
    
}
