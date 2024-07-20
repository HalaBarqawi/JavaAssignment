public class MasterCard extends Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " through MasterCard.");
    }


}
