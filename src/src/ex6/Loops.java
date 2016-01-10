package ex6;

/**
 *
 * @author Georgi Yanev
 */
public class Loops {
    
    public static void main(String[] args) {

        int x,y = 0;
        
        java.util.Scanner reader = new java.util.Scanner(System.in);

        do {
            System.out.print("Type in the height: ");
            y = reader.nextInt();
            System.out.print("Type in the width: ");
            x = reader.nextInt();
            
        } while ( x < 0 && y < 0);
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("x");
            }
                System.out.print("\n");
        }
        
    }
}