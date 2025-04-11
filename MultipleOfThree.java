import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 3 == 0) {
            System.out.println(num + " is a multiple of 3");
        } 
        else {
            System.out.println(num + " is not a multiple of 3");
        }
    }
}
