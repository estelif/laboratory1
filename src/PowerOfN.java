/** This program calculates the power of a number 'a' raised to the exponent 'n'.
 * It uses recursion to compute the power.
 * Time complexity: O(n), where n is the exponent.
 * The findPower method recursively computes the power by multiplying 'a' with itself 'n' times,
 * resulting in linear time complexity.
 * @param a The base number.
 * @param n The exponent.
 * @return The result of 'a' raised to the power of 'n'.
 */
import java.util.Scanner;

public class PowerOfN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findPower(a,n));

    }
    public static int findPower(int a, int n) {
        if (n == 0) {
            return 1;
        } else if(n>0) {
            return a*findPower(a,n-1);
        }
        else{
            return 1/(a*findPower(a,-n-1));
        }
    }
}
