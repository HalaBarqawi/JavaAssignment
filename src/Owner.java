import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private String contactNumber;
    private List<Building> Buildings;

    public Owner(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.Buildings = new ArrayList<>();
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

    public List<Building> getBuildings() {
        return Buildings;
    }

    public List<Building> ownBuildings(Building B){
        Buildings.add(B);
        return Buildings;
    }

}
