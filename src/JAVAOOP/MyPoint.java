package JAVAOOP;

public class MyPoint {
    private double xPoint;
    private double yPoint;

    public MyPoint(){
        this.xPoint = 0;
        this.yPoint = 0;
    }

    public MyPoint(double x, double y){
        this.xPoint = x;
        this.yPoint = y;
    }

    public double getXPoint(){
        return xPoint;
    }

    public double getYPoint(){
        return yPoint;
    }

    public double distance(MyPoint mp) {
        return Math.sqrt(Math.pow(this.xPoint - mp.xPoint, 2) + Math.pow(this.yPoint - mp.yPoint, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.xPoint - x, 2) + Math.pow(this.yPoint - y, 2));
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow(p1.xPoint - p2.xPoint, 2) + Math.pow(p1.yPoint - p2.yPoint, 2));
    }
}
