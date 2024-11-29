package JAVAADT;
/**
 * Sattaporn Kowarakun
 * sattaporn_kowarakun@cmu.ac.th
 * 672115046
 */
import java.util.Vector;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args){

        //1.initialize vector with 10 random value type integer
        Random rand = new Random();

        Vector<Integer> myVector = new Vector<Integer>();

        for(int i=0; i<10; i++){
            myVector.add(i,rand.nextInt(100));
        }

        //search the given value using the linearsearch method 
        int ranNum = rand.nextInt(100);

        System.out.println("We are searching for: "+ranNum);
        if (linearSearch(myVector, ranNum)) {
            System.out.println("We found it!");
        } else {
            System.out.println("Couldn't find it.");
        }

        //print the random numbers
        display(myVector);

        //terminate the program properly when the search end
        System.out.println("\nProgram is done!");

    }  // end main method

    public static boolean linearSearch(Vector<Integer> v, int searchKey){

        //compare the searchkey with each elements in the vector oen by one
        //until the end of the vector
        for(int i=0; i<v.size(); i++){
            if (v.elementAt(i)==searchKey) {
                return true;
            }
        }
        return false;
    } //end methon linearsearch

    //display the vector's element
    public static void display(Vector<Integer> v){
        System.out.println("Here are the values: ");
        for(int i=0; i<v.size(); i++){
            System.out.print("["+v.elementAt(i));
            System.out.print("] ");
        }
    }
}  //end class linearsearch
