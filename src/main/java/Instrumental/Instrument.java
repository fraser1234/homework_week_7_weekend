package Instrumental;

import Shop.ISell;

public abstract class Instrument implements IPlay, ISell{

    private String material;
    private String colour;
    private InstrumentType type;
    private double boughtPrice;
    private double sellPrice;

    public Instrument(InstrumentType type, String material, String colour, double boughtPrice, double sellPrice) {
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public abstract String play(String message);

    public abstract double calculateMarkup();


}
