package Shop;

public class DrumSticks extends ShopItems {
    public DrumSticks(String description, double boughtPrice, double sellPrice) {
        super(description, boughtPrice, sellPrice);
    }

    @Override
    public double calculateMarkup() {
        return 0;
    }

}
