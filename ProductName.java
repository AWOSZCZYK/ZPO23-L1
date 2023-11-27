package List3;

public abstract class ProductName implements Product {
    private String name; // nazwa
    double price; // cena
    int amount; // ilość

    @Override
    public String getName() {
        return name;
    }


}
