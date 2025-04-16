import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The elements are : ");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
