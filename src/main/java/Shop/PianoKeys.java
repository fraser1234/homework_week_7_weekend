package Shop;

public class PianoKeys extends ShopItems {
    public PianoKeys(String description, double boughtPrice, double sellPrice) {
        super(description, boughtPrice, sellPrice);
    }

    @Override
    public double calculateMarkup() {
        double margin = this.getSellPrice() - this.getBoughtPrice();
        double markup = (margin / this.getBoughtPrice()) * 100;
        return markup;
    }
}
