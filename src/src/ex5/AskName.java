package ex5;

import java.util.Scanner;

/**
 *
 * @author Georgi Yanev
 */
public class AskName {

    public static void main(String[] args) {

        int age;
        String fname, lname;
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your last name: ");
        lname = reader.nextLine();
        
        System.out.print("Type in your first name: ");
        fname = reader.nextLine();
        
        System.out.print("Type in your age: ");
        age = reader.nextInt();

        System.out.print("You are " + fname + " " + lname + " and your age is " + age + "years.");
    }
}