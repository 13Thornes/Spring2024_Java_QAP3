import java.util.Arrays;

public class Point {
    // initialize variables
    private float x;
    private float y;


    // create constructors
    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point(float x1, float y1) {
        this.x = x1;
        this.y = y1;
    }

    // Getters

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        float [] fArray = new float[] {x, y};
        System.out.println(Arrays.toString(fArray));
        return fArray;
    }

    // Setters
    public void setX(float x1) {
        this.x = x1;
    }

    public void setY(float y1) {
        this.y = y1;
    }

    public void setXY(float x1, float y1) {
        this.x = x1;
        this.y = y1;
    }

    // toString() method
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
