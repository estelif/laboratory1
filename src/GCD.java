/** This program calculates the greatest common divisor (GCD) of two numbers using recursion.
 * It implements the Euclidean algorithm to find the GCD.
 * Time complexity: O(log(min(a, b))), where a and b are the input numbers.
 * The findGCD method recursively applies the Euclidean algorithm,
 * resulting in logarithmic time complexity.
 * @param a The first integer.
 * @param b The second integer.
 * @return The GCD of the two integers.
 */
import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res= findGCD(a,b);
        System.out.println(res);
    }
    public static int findGCD(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return findGCD(b,a%b);
        }
    }
}
