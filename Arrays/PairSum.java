import java.util.Scanner;

public class PairSum {
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
        System.out.println("Enter the target sum: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j]+ ")");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
