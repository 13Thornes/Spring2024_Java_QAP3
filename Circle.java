class Circle extends Shape{
    
    // initialize variable
    double radius;


    // create constructors
    Circle() {
        radius = 1.0;
    }

    Circle(double r) {
        radius = r;
    }

    Circle(double r, String c, boolean fill) {
        radius = r;
        color = c;
        filled = fill;
    }

    // Getters

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }

    public double getPerimeter() {
        double perimeter = Math.PI * (radius * 2);
        return perimeter;
    }

    // Setters

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "A circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }

}