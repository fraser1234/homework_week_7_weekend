package Instrumental;

public class Piano extends Instrument {

    private int numKeys;

    public Piano(InstrumentType type, String material, String colour, double boughtPrice, double sellPrice, int numKeys) {
        super(type, material, colour, boughtPrice, sellPrice);
        this.numKeys = numKeys;
    }
    public int getNumKeys() {
        return numKeys;
    }

    public void setNumKeys(int numKeys) {
        this.numKeys = numKeys;
    }


    public String play(String message) {
        return "The song playing is: " + message;
    }

    @Override
    public double calculateMarkup() {
        double margin = this.getSellPrice() - this.getBoughtPrice();
        double markup = (margin / this.getBoughtPrice()) * 100;
        return markup;
    }
}
