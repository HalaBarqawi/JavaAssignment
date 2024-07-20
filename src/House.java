public class House extends Building {
    House(String name, String address, int size){
        super(name, address, size);
    }

    @Override
    public void buildingType() {
        System.out.println("Building Type is" + this.getClass().getSimpleName());
    }

}
