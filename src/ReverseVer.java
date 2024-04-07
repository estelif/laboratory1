/** This program prints the given number of integers in reverse order.
 * It uses recursive approach.
 * Time complexity: O(n), where n is the number of integers to be printed.
 * The reverse method recursively reads integers and prints them in reverse order,
 * resulting in linear time complexity.
 * @param sc The Scanner object used for input.
 * @param n The number of integers to be printed in reverse order.
 */
import java.util.Scanner;

public class ReverseVer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(sc, n);
    }

    public static void reverse(Scanner sc, int n) {
        if (n == 0) {
            return;
        }
        int num = sc.nextInt();
        reverse(sc, n - 1);
        System.out.print(num + " ");
    }
}