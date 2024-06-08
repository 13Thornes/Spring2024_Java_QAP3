import java.util.Arrays;

public class MovablePoint extends Point{
    // initialize variables
    private float xSpeed;
    private float ySpeed;

    // create constructors
    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float xs, float ys) {
        this.xSpeed = xs;
        this.ySpeed = ys;
    }

    public MovablePoint(float xs, float ys, float x1, float y1) {
        this.xSpeed = xs;
        this.ySpeed = ys;
        super.setX(x1);
        super.setY(y1);
    }

    // Getters

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        float [] fArray = new float[] {xSpeed, ySpeed};
        System.out.println(Arrays.toString(fArray));
        return fArray;
    }

    // Setters

    public void setXSpeed(float xs) {
        this.xSpeed = xs;
    }

    public void setYSpeed(float ys) {
        this.ySpeed = ys;
    }

    public void setSpeed(float xs, float ys) {
        this.xSpeed = xs;
        this.ySpeed = ys;
    }

    // toString() Method
    public String toString() {
        return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")";
    }

    // Move point
    public MovablePoint move() {
        MovablePoint movepoint = new MovablePoint();
        float x = super.getX();
        x += xSpeed;
        float y = super.getY();
        y += ySpeed;

        movepoint.setXY(x, y);

        return movepoint; 
    }
}