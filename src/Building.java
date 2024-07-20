public abstract class Building {
    private String name; 
    private String address;
    private int size;
    Building(String name, String address, int size){
        this.name = name;
        this.address = address;
        this.size = size;

    }
    Building(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public abstract void buildingType();




}
