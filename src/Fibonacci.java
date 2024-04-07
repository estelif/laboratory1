/** This program calculates the nth Fibonacci number using recursion.
 * It uses a recursive approach to calculate Fibonacci numbers.
 * Time complexity: O(2^n), where n is the index of the Fibonacci number.
 * The fibonacci method recursively calculates Fibonacci numbers by summing the previous two Fibonacci numbers,
 * resulting in exponential time complexity.
 * @param n The index of the Fibonacci number to be calculated.
 * @return The nth Fibonacci number.
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));

    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

}
