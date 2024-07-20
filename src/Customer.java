import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String contactNumber;
    private List<Building> rentedBuildings;

    public Customer(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.rentedBuildings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<Building> getRentedBuildings() {
        return rentedBuildings;
    }

    public List<Building> rentBuildings(Building B){
        rentedBuildings.add(B);
        return rentedBuildings;
    }

}
