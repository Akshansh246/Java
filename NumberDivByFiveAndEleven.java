import java.util.Scanner;

public class NumberDivByFiveAndEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println(n + " is divisible by both 5 and 11");
        }
        else System.out.println(n + " is not Divisible by 5 and 11");
    }
}
