package JAVAADT;

/*author: Sattaporn Kowarakun
 * sattaporn_kowarakun@cmu.ac.th
 * 672115046
 */

import java.io.*;
import java.util.*;

//Student class
class Student {
    private String SID;
    private String firstName;
    private String lastName;

    //Create object Student
    public Student(String SID, String firstName, String lastName) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    // public String toString() {
    //     return this.SID + " " + this.firstName + " " + this.lastName;
    // }
}//End student class


public class Data {
    public static void main(String[] args) throws FileNotFoundException {
        //Input file
        File f = new File("C://Users//Stewie//Documents//ADT Programming Assignment 1//Programming Assignment 1//src//class_roaster67.csv"); //Your file's path
        Scanner in = new Scanner(f);

        //Skip the unnecessary first 7 line
        for (int i = 0; i < 7; i++) {
            in.nextLine();
        }

        Vector<Student> student = new Vector<>();

        //Read and store students data
        while (in.hasNextLine()) {
            String dataLine = in.nextLine();
            StringTokenizer stu = new StringTokenizer(dataLine.trim(), ",");
            stu.nextToken();
            student.addElement(new Student(stu.nextToken(), stu.nextToken(), stu.nextToken()));
        }

        //Display all students
        for (Student i : student) {
            System.out.println(i.toString());
        }

        //Display result
        displayResult(student);
    }//End main method

    public static void displayResult(Vector<Student> students) {
        System.out.println("\nTotal students: " + students.size());

        //Find student's name that started with each letter A-Z and count it
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            int count = 0;

            //Create a vector that contain student's name in each letter (A-Z)
            Vector<Student> studentsWithLetter = new Vector<>();
            
            //Check and add student's name that initialed with each letter (A-Z) in to the Vector
            for (Student student : students) {
                if (Character.toUpperCase(student.getFirstName().charAt(0)) == letter) {
                    studentsWithLetter.add(student);
                    count++;
                }
            }

            //Display each letter A-Z that student's name initialed with it
            if (count > 0) {
                System.out.println(letter + ": " + count);
                for (Student student : studentsWithLetter) {
                    System.out.println(student);
                }
            }
        }
    }//End displayresult method
}//End data class
