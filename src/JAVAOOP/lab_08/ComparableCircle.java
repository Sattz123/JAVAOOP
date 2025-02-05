package JAVAOOP.lab_08;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(double radius){
        super(radius);
     }
     @Override
     public int compareTo(ComparableCircle o){
         if(this.getRadius() > o.getRadius()){
             return 1;
         }
         else if(this.getRadius() < o.getRadius()){
             return -1;
         }
         else{
             return 0;
         }
     }
}

class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(15);
        
        int flag = circle1.compareTo(circle2);
        
        switch (Integer.signum(flag)) {
            case 1:
                System.out.println("The max circle's radius is " + circle1.getRadius());
                break;
            case -1:
                System.out.println("The max circle's radius is " + circle2.getRadius());
                break;
            default:
                System.out.println("Both circles have the same radius.");
                break;
        }
    }
}