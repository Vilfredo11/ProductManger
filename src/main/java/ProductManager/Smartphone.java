package ProductManager;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String title, int price, String manufacturer) {
        super(id, title, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
