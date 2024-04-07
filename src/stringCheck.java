/** This program checks if a given string consists only of digits.
 * It uses recursion to iterate through each character of the string.
 * Time complexity: O(n), where n is the length of the string.
 * The allDigits method recursively checks each character of the string,
 * resulting in linear time complexity.
 * @param n The input string to be checked.
 * @param i The current index being checked.
 * @return True if the string consists only of digits, false otherwise.
 */
import java.util.Scanner;

public class stringCheck {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String n = sc.nextLine();
        if(allDigits(n,0)){
            System.out.println("Yes");

        }
        else{
            System.out.println("No");
        }
    }
    public static boolean allDigits(String n, int i){
        if (i == n.length()) {
            return true;
        }
        if (Character.isDigit(n.charAt(i))) {
            return allDigits(n, i + 1);
        }
        return false;
    }
}
