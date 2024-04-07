/** This program calculates the factorial of a given number.
 * It uses recursion.
 * Time complexity: O(n), where n is the given number.
 * The factorial method recursively multiplies the number with (n-1) until n becomes 1,
 * resulting in linear time complexity.
 * @param n The number for which factorial is to be calculated.
 * @return The factorial of the given number.
 */

import java.util.Scanner;

public class getFactorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0){
            System.out.println("NOT defined");
        }
        else{
            System.out.println(factorial(n));
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
