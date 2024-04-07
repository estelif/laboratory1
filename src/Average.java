/** This method calculates the average of elements in an array.
 * It uses recursion to find the sum of elements and then divides it by the number of elements.
 * Time complexity: O(n), where n is the number of elements in the input array.
 * The sumOfElements method iterates through the array recursively, resulting in linear time complexity.
 * @param arr The array of integers for which we need to calculate the average.
 * @param n The number of elements in the array.
 * @return The average of the elements in the array.
 */
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double average= getAverage(arr,n);
        System.out.println(average);
}
    public static double getAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        int sum = sumOfElements(arr, n);
        return (double) sum/n;
    }
    public static int sumOfElements(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        else{
            return arr[n-1]+sumOfElements(arr,n-1);
        }
    }
}
