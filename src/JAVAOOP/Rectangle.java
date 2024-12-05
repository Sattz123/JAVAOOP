package JAVAOOP;

public class Rectangle {
    private float height;
    private float width;

    public Rectangle(float hei,float wid){
        height = hei;
        width = wid;
    }
    
    public float Area(){
        return width * height;
    }
    
    public float Perimeter(){
        return 2 * (width+height);
    }
}
