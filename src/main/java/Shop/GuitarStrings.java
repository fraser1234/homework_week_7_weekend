package Shop;

public class GuitarStrings extends ShopItems {
    public GuitarStrings(String description, double boughtPrice, double sellPrice) {
        super(description, boughtPrice, sellPrice);
    }

    @Override
    public double calculateMarkup() {
        double margin = this.getSellPrice() - this.getBoughtPrice();
        double markup = (margin / this.getBoughtPrice()) * 100;
        return markup;
    }

}
