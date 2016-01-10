package ex6;

/**
 *
 * @author Georgi Yanev
 */
public class OddOrEven {
    
    public static void main(String[] args) {

        int num;
        
        java.util.Scanner reader = new java.util.Scanner(System.in);

        System.out.print("Type in an integer: ");
        
        num = reader.nextInt();
        
        if (num > 0){
            if(num % 2 == 0){
                System.out.print("Number " + num + " is even.");
                
            } else {
                System.out.print("Number " + num + " is odd.");
            }
        }
    }
}
