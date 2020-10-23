import java.util.Scanner;

/**
 * @author Oleg Stanasiuk
 * @version 1.0
 */

/**
 *The main class
 */
public class Main {
    /**
     * main function with creating object and call of functions from class "Interval"
     */
    public static void main(String[] args) {
        Interval interval = new Interval();
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter begin of interval: ");
        interval.x1 = in.nextInt();
        System.out.print("\nEnter end of interval: ");
        interval.x2 = in.nextInt();
        interval.odd();
        interval.even();
        interval.sumOdd();
        interval.sumEven();
        System.out.print("\nEnter length of Fibonacci: ");
        interval.length = in.nextInt();
        interval.fibonacci();
        System.out.print("\nEven percent: " + interval.evenPercent() + "%");
        System.out.print("\nOdd percent: " + interval.oddPercent() + "%");
    }
}