package ex7;

/**
 *
 * @author Georgi Yanev
 */
public class HighLow {

    public static int low(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            return n1;
        } else if (n2 < n1 && n2 < n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static int high(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }
}
