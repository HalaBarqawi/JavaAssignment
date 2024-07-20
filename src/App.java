import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Ahmad", "05948756");
        Building b1 = new Apartment("Apartment1", "Nablus", 200);
        Building b2 = new Shop("Shop1", "Tulkarem", 150);

        Owner owner = new Owner("Omar", "059479756");
        owner.ownBuildings(b2);
        owner.ownBuildings(b1);
        customer.rentBuildings(b1);
        System.out.println(customer.getRentedBuildings());
        Payment paymentMethod = new Visa();
        Contract contract = new Contract(customer, owner, b1, "3", 500, paymentMethod);
        contract.printContractForm();
        paymentMethod.pay(500);

    }
}
