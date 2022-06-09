import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 7};
//        int n = arr.length;
        System.out.println("Enter number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements : ");
            Scanner sc2 = new Scanner(System.in);
            arr[i] = sc2.nextInt();
        }

        int res = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= res) {
                res += arr[i];
            }
        }
        System.out.println(res);
    }
}
