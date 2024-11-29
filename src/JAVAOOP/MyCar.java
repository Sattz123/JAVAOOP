package JAVAOOP;

public class MyCar {
    public static void main(String[] args) {
        Car Toyota = new Car ("red");
        Car Honda = new Car ("blue");

        Toyota.setSpeed(200);
        Toyota.setMilage(1345);

        Honda.setSpeed(300);
        Honda.setMilage(8987);

        System.out.println("Toyota color: "+Toyota.getColor()+" speed: "+Toyota.getSpeed()+" mleage: "+Toyota.getMilage());
        System.out.println("Honda color: "+Honda.getColor()+" speed: "+Honda.getSpeed()+" mileage: "+Honda.getMilage());
    }
    
}
