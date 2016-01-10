/**
 *
 * @author Georgi Yanev
 */
public class Calculation {
    
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);        

        int choice = 0;
        
        System.out.print("Choose from the following calculations:\n1: subtraction\n2: addition\n3: multiplication\n4: division\n5: remainder\n\nMake your choice: ");
        
        choice = reader.nextInt();
        
        switch(choice) {
            case 1:
                doCalc(1);
                break;
            case 2:
                doCalc(2);
                break;
            case 3:
                doCalc(3);
                break;
            case 4:
                doCalc(4);
                break;
            case 5:
                doCalc(5);
                break;
            default:
                System.out.print("Invalid choice.");
                break;
        }
                
    }
    
    public static void doCalc(int operation){
        java.util.Scanner reader = new java.util.Scanner(System.in);        
        int x,y = 0;
        
        do {
            System.out.print("Type in the first number: ");
            x = reader.nextInt();
            System.out.print("Type in the second number: ");
            y = reader.nextInt();
            
        } while ( x < 0 && y < 0);
        
        switch(operation){
            case 1:
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case 2:
                System.out.print(x + " + " + y + " = " + (x + y));
                break;
            case 3:
                System.out.print(x + " * " + y + " = " + (x * y));
                break;
            case 4:
                System.out.print(x + " / " + y + " = " + ((double)x/y));
                break;
            case 5:
                System.out.print(x + " % " + y + " = " + (x % y));
                break;
        }
    }
}