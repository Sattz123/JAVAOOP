package JAVAADT;

import java.util.*;

public class VectorStringCompare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Vector<String> myFruits = new Vector<String>();
        String stopWord = "quit";

        System.out.print("Enter Fruit (Type quit to exit input): ");

        while (true){
            String ans = input.nextLine();
            if (ans.equals(stopWord)) {
                break;
            }
            myFruits.add(ans);
        }

        System.out.println("Number of lines: "+myFruits.size());
        System.out.println("First line: "+myFruits.firstElement());
        System.out.println("Last line: "+myFruits.lastElement());
        
        for(int i = myFruits.size() - 1; i>=0; i--){
            System.out.println(myFruits.get(i));
        }
    }    
}
