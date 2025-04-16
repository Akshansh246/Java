import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements in array is: " + sum);
    }
}
