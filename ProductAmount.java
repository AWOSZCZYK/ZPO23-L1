package List3;

public abstract class ProductAmount implements Product{
    int amount; //ilość

    @Override
    public int getAmount() {
        return amount;
    }
}
