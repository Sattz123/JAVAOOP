

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this ("white",false);
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A Shape with color of "+ color +" and "+(filled ? "filled" : "not filled");
    }
}


class Circle extends Shape{
    private double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius *radius;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius="+ radius +", which is a subclass of " + super.toString();
    }
}


class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return (2*width)+(2*length);
    }

    @Override
    public String toString(){
        return "A Rectangle with width="+ width +" and length="+length+", which is a subclass of "+super.toString();
    }
}