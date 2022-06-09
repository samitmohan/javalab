/* Print sum of elements of the array with conditions -:
   If array has 6 and 7 in succeeding orders, ignore 6 and 7 and numbers between them for the calculation of sum.
 */

import java.util.Scanner;

public class sumOfElem {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Size : " + n);

        int[] arr = new int[n];
        System.out.println("Enter numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sixPos = -1;
        int sevenPos = -1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                sixPos = i;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                sevenPos = i;
                break;
            }
        }

        // if none present
        if (sevenPos == -1) {
            sixPos = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            // if six is present and i is between 6 and 7, sum them up.
            if (sixPos != -1 && i >= sixPos && i <= sevenPos) continue;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
