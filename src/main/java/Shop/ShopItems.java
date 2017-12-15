package Shop;

public abstract class ShopItems implements ISell{

    private String description;
    private double boughtPrice;
    private double sellPrice;

    public ShopItems(String description, double boughtPrice, double sellPrice) {
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public abstract double calculateMarkup();
}
