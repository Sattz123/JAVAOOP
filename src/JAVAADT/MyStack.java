package JAVAADT;

/*  @author: Sattaporn Kowarakun
 *           sattaporn_kowarakun@cmu.ac.th
 *           672115046
 */

public class MyStack {
    //Attributes
    private int maxSize;
    private double[] stackArray;
    private int top;

    //Constructor
    public MyStack(int s){
        this.maxSize = s;
        this.stackArray = new double [this.maxSize];
        this.top = -1;
    }

    //Implement methods
    public void push(long j){
        if (!isFull()) {
            stackArray[++top] = j;
        } else System.out.println("The stack is fulled");
    }

    public long pop(){
        if (!isEmpty()) {
            int pop = (int)stackArray[top--];
            System.out.println("Popped " + pop);
            return pop;
        } else {
            System.out.println("There are no element left in stack");
            return -1;
        }
        
    }

    public long peek(){
        int peek = (int)stackArray[top];
        System.out.println("Peeked "+ peek);
        return peek;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

    //Main method
    public static void main(String[] args){
        MyStack newStack = new MyStack(9);
        int[] stdID = {6,7,2,1,1,5,0,4,6};

        //Push Student ID
        for(int std : stdID){
            newStack.push(std);
        }

        newStack.peek();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        System.out.println("Numbers of elements left is: "+ (newStack.top+1));
    }
}
