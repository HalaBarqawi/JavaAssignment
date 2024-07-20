public class PayPal extends Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " through PayPal.");
    }

}
