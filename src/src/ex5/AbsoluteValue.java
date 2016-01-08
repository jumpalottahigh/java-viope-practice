package ex5;

import java.util.Scanner;

/**
 *
 * @author Georgi Yanev
 */
public class AbsoluteValue {
    
    public static void main(String[] args) {

        double num, abs;
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in a floating point number: ");
        
        num = reader.nextDouble();
        
        abs = num > 0 ? num : num * (-1);
        
        System.out.print("The absolute value of the given number is " + abs);
    }
}
