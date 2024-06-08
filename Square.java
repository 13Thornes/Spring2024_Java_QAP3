class Square extends Rectangle {

    // initialize variables
    double side;

    // create constructors

    public Square() {
       super.width = 1.0;
       super.length = 1.0;
       side = super.width;
    }

    public Square(double side) {
        super(side, side); // call superclass Rectangle(double, double)
    }

    public Square(double side, String c, boolean fill) {
        super(side, side);
        color = c;
        filled = fill;
    }

    // Getters

    public double getSide() {
        side = super.width;
        return side;
    }

    // Setters
    public void setSide(double s) {
        side = s;
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // toString() method
    public String toString() {
        return "A Square with side=" + side + ", which is a subclass of " + super.toString();
    }

}
