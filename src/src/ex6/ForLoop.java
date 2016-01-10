package ex6;

/**
 *
 * @author Georgi Yanev
 */
public class ForLoop {
    
    public static void main(String[] args) {

        int n;
        
        java.util.Scanner reader = new java.util.Scanner(System.in);

        System.out.print("Type in an integer: ");
        
        n = reader.nextInt();
        
        if (n > 0){
            for (int i = n; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
                System.out.println("Input is not a positive integer.");
        }
    }
}