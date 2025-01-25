package JAVAADT.Tutorial4;

/*  @author: Sattaporn Kowarakun
 *           sattaporn_kowarakun@cmu.ac.th
 *           672115046
*/

import java.util.Scanner;

public class MyStudentHekodeskQueue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StudentHelpdeskQueue newLine = new StudentHelpdeskQueue(5);

        System.out.println("Please enter student name (enter 'quit' to exit, enter 'dq' to dequeue)");
        while (true) {
            String name = input.nextLine();
            if (name.equals("quit")) {
                break;
            } else if (name.equals("dq")) {
                newLine.dequeue();
            } else newLine.enqueue(name);
        }
    }
}
