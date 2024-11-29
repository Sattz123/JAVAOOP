package JAVAOOP;

public class Dog{

    public static float weight;
    public static String color;

    public Dog (String col, float wei){
        color = col;
        weight = wei;
    }
    
    public String getColor(){
        return color;
    }

    public float getWeight(){
        return weight;
    }
}