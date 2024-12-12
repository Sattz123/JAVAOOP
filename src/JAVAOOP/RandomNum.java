package JAVAOOP;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random rand = new Random(1000);

        for(int i=0; i<50; i++){

            if((i == 20) || (i == 41)){
                System.out.println();
            }
            
            System.out.print(rand.nextInt(100)+" ");
        }
    }
}
