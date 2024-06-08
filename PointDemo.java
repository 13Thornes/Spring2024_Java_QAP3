public class PointDemo {
    public static void main(String[] args) {

        // New movable points
        MovablePoint p1 = new MovablePoint();
        MovablePoint p2 = new MovablePoint(2.0f, 3.0f);
        MovablePoint p3 = new MovablePoint(2.0f, 3.0f, 4.0f, 5.0f);

        // test p1
        p1.getXY();

        // test p2
        p2.setXY(1.0f, 2.0f);

        p2.getXY();

        System.out.println(p2.toString());

        // Test p3
        p3.getSpeed();

        System.out.println(p3.toString());

        System.out.println(p3.move());


    }
}
