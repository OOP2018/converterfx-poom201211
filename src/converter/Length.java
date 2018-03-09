package converter;

public enum Length {
    // initializing each members first.
    Meter(1.0),
    Centimeter(0.01),
    Kilometer(1000.0),
    Mile(1609.344),
    Foot(0.3048),
    Wa(2.0),
    AU(149597870700.0);

    // attributes of the enum member
    private final double value;

    /**
     * constructor for enum class is already private by default
     * @param value
     */
    Length(double value) {
        this.value = value;
    }

    /**
     * Method for returning the value of this enum
     * @return this value
     */
    public double getValue(){
        return this.value;
    }
}

