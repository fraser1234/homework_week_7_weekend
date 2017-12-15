package Instrumental;

public enum InstrumentType {

    WOOD("Wood"),
    BRASS("Brass"),
    KEYBOARD("Keyboard"),
    STRING("String"),
    METAL("Metal");

    private String type;

    InstrumentType(String type) {
        this.type = type;

    }

    public String getType() {
        return type;
    }


}
