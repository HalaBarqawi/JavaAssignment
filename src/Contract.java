
public class Contract {
    Customer customer;
    Owner owner;
    Building building;
    private String rentalPeriod;
    private double price;
    private Payment paymentMethod;

    public Contract(Customer customer, Owner owner, Building building, String rentalPeriod, double price,
            Payment paymentMethod) {
        this.customer = customer;
        this.owner = owner;
        this.building = building;
        this.rentalPeriod = rentalPeriod;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public void printContractForm() {

        System.out.println("The cusomer " + this.customer.getName());
        System.out.println("" + this.owner.getName());
        System.out.println(this.building.getName());
        building.buildingType();
        System.out.println(this.building.getAddress());
        System.out.println(building.getSize());
        System.out.println(rentalPeriod);
        System.out.println(price);
        System.out.println(paymentMethod.getClass().getSimpleName());

    }

}
