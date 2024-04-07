/** This program calculates the binomial coefficient C(n, k) using recursion.
 * It implements the recursive formula C(n, k) = C(n-1, k-1) + C(n-1, k).
 * Time complexity: O(2^n), where n is the value of 'n'.
 * The binomialCoef method recursively calculates the binomial coefficient using the above formula,
 * resulting in exponential time complexity.
 * @param n The total number of items.
 * @param k The number of items to be chosen.
 * @return The binomial coefficient C(n, k).
 */
import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k<0 || k>n){
            System.out.println("invalid");
        }
        else{
            int res=binomialCoef(n,k);
            System.out.print(res);
        }
    }
    public static int binomialCoef(int n,int k){
        if(k==0 || k==n){
            return 1;
        }
        return binomialCoef(n-1,k-1)+binomialCoef(n-1,k);
    }
}
