/** This program checks whether a given number is prime or composite.
 * It uses recursion to check divisibility of the number by iterating from 2 to n/2.
 * Time complexity: O(n/2), where n is the given number.
 * The isPrime method recursively checks divisibility, resulting in linear time complexity.
 * @param n The number to be checked for primality.
 * @param i The divisor used for checking divisibility.
 * @return True if the number is prime, false otherwise.
 */
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n,2)){
        System.out.println(n + " Prime");}
        else{
            System.out.println(n + " Composite");
        }
    }
    public static boolean isPrime(int n, int i){
        if(n==0 || n==1){
            return false;
        }
        if(n==i){
            return true;
        }
        if(n%i==0){
            return false;
        }
        return isPrime(n,i+1);
    }
}
