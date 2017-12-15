package Shop;

public class PianoKeys extends ShopItems {
    public PianoKeys(String description, double boughtPrice, double sellPrice) {
        super(description, boughtPrice, sellPrice);
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }
}
