import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        int n, ecount=0, ocount = 0;
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
            if (arr[i]%2==0) {
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("Even count: "+ecount);
        System.out.println("Odd count: "+ocount);
    }
}
