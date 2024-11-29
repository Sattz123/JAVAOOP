package JAVAOOP;

public class Dog{

    static float weight;
    static String color;

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