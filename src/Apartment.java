public class Apartment extends Building {
    Apartment(String name, String address, int size){
        super(name, address, size);
    }

    @Override
    public void buildingType() {
        System.out.println("Building Type is" + this.getClass().getSimpleName());
    }
    
}
