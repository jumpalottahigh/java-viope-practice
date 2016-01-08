package ex5;

import java.util.Scanner;

/**
 *
 * @author Georgi Yanev
 */
public class DecimalCalculations {

    public static void main(String[] args) {

        double fn, sn, div, mul;
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the first number: ");
        fn = reader.nextDouble();
        
        System.out.print("Type in the second number: ");
        sn = reader.nextDouble();
        
        mul = fn * sn;
        div = fn / sn;
        
        System.out.print("Result of the multiplication: " + mul);
        System.out.print("Result of the division: " + div);
    }
}