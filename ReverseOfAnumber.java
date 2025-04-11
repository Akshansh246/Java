import java.util.Scanner;

public class ReverseOfAnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int r = 0;
        while (n>0) {
            r = r*10;
            r = r+(n%10);
            n = n/10;
        }
        System.out.println("Reverse of the number is: "+r);
    }
}
