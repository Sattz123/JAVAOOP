package JAVAOOP;

import java.util.Random;

public class Trigonometric {
    public static void main(String[] args){
        Random rand = new Random();

        int randomNumber = 20 + rand.nextInt(20);

        System.out.println("The sine of "+ randomNumber + " is "+ Math.sin(randomNumber));
        System.out.println("The cosine of "+ randomNumber + " is "+ Math.cos(randomNumber));
        System.out.println("The tangent of "+ randomNumber + " is "+ Math.tan(randomNumber));
    }
}
