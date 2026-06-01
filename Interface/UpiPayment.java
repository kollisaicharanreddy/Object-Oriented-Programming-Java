package Interface;

public class UpiPayment implements PaymentMethod {
    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI ID: " + upiId);
    }
}
