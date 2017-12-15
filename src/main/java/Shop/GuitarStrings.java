package Shop;

public class GuitarStrings extends ShopItems {
    public GuitarStrings(String description, double boughtPrice, double sellPrice) {
        super(description, boughtPrice, sellPrice);
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }

}
