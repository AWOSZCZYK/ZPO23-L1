package List3;

public abstract class ProductPrice implements Product{
    double price; // cena

    @Override
    public double getPrice() {
        return price;
    }
}
