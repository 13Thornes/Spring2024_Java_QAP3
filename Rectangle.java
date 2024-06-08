class Rectangle extends Shape {
    
    // initialize variable
    double width;
    double length;


    // create constructors
    Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    Rectangle(double w, double l) {
        width = w;
        length = l;
    }


    Rectangle(double w, double l, String c, boolean fill) {
        width = w;
        length = l;
        color = c;
        filled = fill;
    }

    // Getters

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        double area = width * length;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (width * 2) + (length * 2);
        return perimeter;
    }

    // Setters

    public void setWidth(double w) {
        width = w;
    }

    public void setLength(double l) {
        length = l;
    }

    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
