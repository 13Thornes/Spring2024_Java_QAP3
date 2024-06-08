class Shape {
    
    // initialize variables
    String color = "red";
    boolean filled = true;

    // create contructor
    Shape() {
        color = "green";
        filled = true;
    }

    Shape(String c, boolean fill) {
        color = c;
        filled = fill;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    //Setters
    public void setColor(String c) {
        color = c;
    }

    public void setFilled(boolean fill) {
        filled = fill;
    }

    // toString() method
    public String toString() {
       return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
