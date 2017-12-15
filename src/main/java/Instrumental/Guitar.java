package Instrumental;

public class Guitar extends Instrument {

    private int numStrings;

    public Guitar(InstrumentType type, String material, String colour, double boughtPrice, double sellPrice, int numStrings) {
        super(type, material, colour, boughtPrice, sellPrice);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public String play(String message) {
        return "The song playing is: " + message;
    }
}
