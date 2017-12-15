package Instrumental;

public class Triangle extends Instrument  {

    private int numEdges;

    public Triangle(InstrumentType type, String material, String colour, double boughtPrice, double sellPrice, int numEdges) {
        super(type, material, colour, boughtPrice, sellPrice);
        this.numEdges = numEdges;
    }

    public int getNumEdges() {
        return numEdges;
    }


    public String play(String message) {
        return "The song playing is: " + message;
    }
}
