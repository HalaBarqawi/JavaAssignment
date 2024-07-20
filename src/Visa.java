public class Visa extends Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " through Visa.");
    }

}
