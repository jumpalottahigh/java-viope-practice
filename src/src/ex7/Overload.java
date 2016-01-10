package ex7;

/**
 *
 * @author Georgi Yanev
 */
public class Overload {

    public static void greet() {
        System.out.print("Hi!");
    }

    public static void greet(String fname) {
        System.out.print("Hi, " + fname);
    }

    public static void greet(String fname, String lname) {
        System.out.print("Hi, " + fname + " and " + lname);
    }
}
