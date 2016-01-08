package ex6;

import java.util.Scanner;

/**
 *
 * @author Georgi Yanev
 */
public class OddOrEven {
    
    public static void main(String[] args) {

        double num, abs;
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in a floating point number: ");
        
        num = reader.nextDouble();
        
        abs = num > 0 ? num : num * (-1);
        
        System.out.print("The absolute value of the given number is " + abs);
    }
    
    
//    Create a program that asks for a positive integer (zero will not do) and check if the number is even or odd. 
//            If number is even, “Number X is even” is printed on screen and “Number X is odd” is printed if the number is odd. 
//            X marks the number user types in. If the given number is zero or a negative number, program prints “Input is invalid” 
//            on screen and program execution ends.
//
//Hint: Number is even if its division remainder is 0 when divided by 2.
//
//Program is written to a class called OddOrEven.
//
//
//Example output:
//Type in an integer: 8
//Number 8 is even.
//The verification of program output does not account for whitespace and is not case-sensitive (the least strict comparison level)
}
