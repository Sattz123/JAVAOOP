package JAVAOOP;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0,0);
        MyPoint point2 = new MyPoint(10,30.5);

        System.out.println("Distance from instance method: " + p1.distance(point2));
        System.out.println("Distance from coordinates: " + p1.distance(point2.getXPoint(), point2.getYPoint()));
        System.out.println("Distance from static method: " + MyPoint.distance(p1, point2));
    }
}
