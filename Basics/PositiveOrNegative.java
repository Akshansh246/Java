import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number==0) {
            System.out.println("Zero");
        }
        else if (number>0) {
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
