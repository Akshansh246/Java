import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n > 1) {
            int count = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(n + " is a prime number.");
            } 
            else {
                System.out.println(n + " is not a prime number.");
            }
                
        }
    }
}
