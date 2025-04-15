import java.util.Scanner;

public class AlphaPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int d = 65;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                d = a+64;
                System.out.print((char) d + " ");
                a++;    
            }
            System.out.println();
        }
    }
}
