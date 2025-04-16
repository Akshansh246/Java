package Arrays;
import java.util.Scanner;

public class SumOfDigitsOfAnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        int sum = 0;
        while (a > 0) {
            int ld = a % 10;
            sum = sum + ld;
            a = a/10;
        }
        System.out.println(sum);
    }
}
